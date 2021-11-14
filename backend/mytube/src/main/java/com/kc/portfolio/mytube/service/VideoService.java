package com.kc.portfolio.mytube.service;


import com.kc.portfolio.mytube.MytubeApplication;
import com.kc.portfolio.mytube.config.auth.dto.SessionUser;
import com.kc.portfolio.mytube.domain.like.video.LikeVideo;
import com.kc.portfolio.mytube.domain.like.video.LikeVideoRepository;
import com.kc.portfolio.mytube.domain.user.User;
import com.kc.portfolio.mytube.domain.user.UserRepository;
import com.kc.portfolio.mytube.domain.video.Video;
import com.kc.portfolio.mytube.domain.video.VideoRepository;
import com.kc.portfolio.mytube.web.dto.VideoInfoListItemDto;
import com.kc.portfolio.mytube.web.dto.VideoInfosDto;
import com.kc.portfolio.mytube.web.dto.VideoResolutionDto;
import com.kc.portfolio.mytube.web.dto.VideoUploadRequestDto;
import com.nimbusds.oauth2.sdk.util.StringUtils;
import lombok.RequiredArgsConstructor;
import net.bramp.ffmpeg.FFmpeg;
import net.bramp.ffmpeg.FFprobe;
import net.bramp.ffmpeg.builder.FFmpegBuilder;
import net.bramp.ffmpeg.probe.FFmpegProbeResult;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.core.io.FileUrlResource;
import org.springframework.core.io.UrlResource;
import org.springframework.core.io.support.ResourceRegion;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.MediaTypeFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.util.*;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class VideoService {
    private final VideoRepository videoRepository;
    private final UserRepository userRepository;
    private static final long CHUNK_SIZE = 1024*1024*10L;
    private final HttpSession httpSession;
    private final LikeVideoRepository likeVideoRepository;
    private final AsyncService asyncService;

    private final KeywordService keywordService;

    @Value("${ffmpeg.ffmpeg.path}")
    private String ffmpegPath;
    @Value("${ffmpeg.ffprobe.path}")
    private String ffprobePath;

    @Transactional(readOnly = true)
    public List<VideoResolutionDto> getResolutions(Long videoId){
        Video video = videoRepository.findById(videoId).get();
        if(video == null) return new ArrayList<>();
        return video.getVideoUrlMap().entrySet().stream().sorted(Comparator.comparing(p->-p.getKey())).map(p->
                VideoResolutionDto.builder()
                        .src(String.format("/streaming/%d/%d",videoId.intValue(), p.getKey().intValue()))
                        .label(String.format("%dp", p.getKey().intValue()))
                        .type("video/mp4")
                        .build()).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public List<VideoInfoListItemDto> getRecommendedVideo(SessionUser user, String keyword, Long page, Long size){
        if(keyword== null){
            PageRequest pageRequest = PageRequest.of(page.intValue(), size.intValue(), Sort.by("createdDate").descending());
            return videoRepository.findAll(pageRequest).stream()
                    .map(v -> VideoInfoListItemDto.builder()
                            .title(v.getTitle())
                            .userInfoDto(v.getUser().toSimpleInfoDto())
                            .thumbnailUrl("/thumbnail/" + v.getId())
                            .view(v.getViews())
                            .createdTime(v.getCreatedDate())
                            .modifiedTime(v.getModifiedDate())
                            .videoLength(v.getVideoLength())
                            .videoUrl("/video?id=" + v.getId())
                            .build()
                    ).collect(Collectors.toList());
        }else{
            System.out.println("키워드 검색!");
            keywordService.insertKeyword(keyword);
            return videoRepository.searchByKeyword(keyword, Sort.by("createdDate").descending()).stream()
                    .map(v -> VideoInfoListItemDto.builder()
                            .title(v.getTitle())
                            .userInfoDto(v.getUser().toSimpleInfoDto())
                            .thumbnailUrl("/thumbnail/" + v.getId())
                            .view(v.getViews())
                            .createdTime(v.getCreatedDate())
                            .modifiedTime(v.getModifiedDate())
                            .videoLength(v.getVideoLength())
                            .videoUrl("/video?id=" + v.getId())
                            .build()
                    ).collect(Collectors.toList());
        }
    }

    @Transactional
    public Long uploadVideo(MultipartFile videoFile, MultipartFile thumbnail,
                              VideoUploadRequestDto requestDto, SessionUser user) throws IOException {
        String rootPath = System.getProperty("user.dir");
        final Video video = videoRepository.save(Video.builder()
                .title(requestDto.getTitle())
                .description(requestDto.getDescription())
                .user(userRepository.findByEmail(user.getEmail()).get())
                .build()
        );

        String videoPath = rootPath+MytubeApplication.VIDEO_PATH+"/"+video.getId();
        if (!new File(videoPath).exists()) {
            try{
                new File(videoPath).mkdir();
            }
            catch(Exception e){
                e.getStackTrace();
            }
        }

        String videoFilePath = videoPath+"/"
                +videoFile.getResource().getFilename();
        String thumbnailFilePath = videoPath+"/"
                +thumbnail.getResource().getFilename();

        System.out.println(videoFilePath);
        try {
            videoFile.transferTo(
                    new File(videoFilePath));
            thumbnail.transferTo(
                    new File(thumbnailFilePath));
            video.setThumbnail(thumbnailFilePath);
        } catch (IOException e) {
            e.printStackTrace();

        }
        FFprobe ffprobe = new FFprobe(ffprobePath);  //리눅스에 설치되어 있는 ffmpeg 폴더
        FFmpegProbeResult probeResult = ffprobe.probe(videoFilePath);
        Long resolution = Long.valueOf(probeResult.streams.get(0).height);

        video.addVideoUrl(videoFilePath, resolution);
        video.updateRunningTime(videoFilePath, ffprobePath);
        if(video.getThumbnailUrl() == null) {
            video.extractThumbnail(videoFilePath, ffmpegPath);
        }
        try {
            video.postProcesThumbnail();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return video.getId();
    }

    @Async
    @Transactional
    public void postProcess(Long videoId) throws IOException {
        Video video = videoRepository.findById(videoId).get();

        FFmpeg fFmpeg = new FFmpeg(ffmpegPath);



        Map<Long, String> urlMap = video.getVideoUrlMap();
        String tempUrl = System.getProperty("user.dir") + MytubeApplication.VIDEO_PATH + "/" + videoId + "/resolution%d.mp4";
        Long maxResolution = (Long)video.getVideoUrlMap().keySet().toArray()[0];


        FFprobe ffprobe = new FFprobe(ffprobePath);  //리눅스에 설치되어 있는 ffmpeg 폴더
        FFmpegProbeResult probeResult = ffprobe.probe(urlMap.get(maxResolution));
        Long height = Long.valueOf(probeResult.streams.get(0).height);
        Long width = Long.valueOf(probeResult.streams.get(0).width);
        for(int i = 0; i < Video.RESOLUTIONS.length; i++){
            final int temp = i;
            if(Video.RESOLUTIONS[i] <= maxResolution){
                asyncService.run(()-> {
                    while(true){
                        try {
                            scaleVideos(videoId, Video.RESOLUTIONS[temp], urlMap.get(maxResolution), width, height);
                            break;
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
            }
        }
    }

    @Async
    @Transactional
    public void scaleVideos(Long videoId, Long target, String path, Long width, Long height) throws IOException {
        Video video = videoRepository.findById(videoId).get();
        FFmpeg fFmpeg = new FFmpeg(ffmpegPath);
        String tempUrl = System.getProperty("user.dir") + MytubeApplication.VIDEO_PATH + "/" + videoId + "/resolution%d.mp4";
        FFmpegBuilder fFmpegBuilder = new FFmpegBuilder();
        fFmpegBuilder.setInput(path)
                .overrideOutputFiles(true)
                .overrideOutputFiles(true)
                .addOutput(String.format(tempUrl, target.intValue()))
                .setFormat("mp4")
                .setPreset("medium")
                .setVideoBitRate(3000000L)
                .setVideoCodec("libx264")
                .setVideoFilter(String.format("\"scale=%d:%d,format=yuv420p\"", width.intValue()*target.intValue()/height.intValue()/2*2, target.intValue()))
                .setAudioCodec("aac")
                .setAudioBitRate(128000L)
                .setAudioChannels(2)
                .setAudioSampleRate(44100);
        fFmpeg.run(fFmpegBuilder);
        video.addVideoUrl(String.format(tempUrl, target), target);
    }


    @Transactional(readOnly = true)
    public byte[] loadThumbnail(Long videoId){
       String filePath = videoRepository.findById(videoId).get().getThumbnailUrl();
        try {
            return Files.readAllBytes(new File(filePath).toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public VideoInfosDto getVideoInfos(Long videoId, SessionUser sessionUser){
        Video video = videoRepository.findById(videoId).get();
        HashSet<Long> haveSeen = (HashSet<Long>)httpSession.getAttribute("haveSeen");
        if(haveSeen==null)
            haveSeen = new HashSet<>();
        if(!haveSeen.contains(videoId)){
            haveSeen.add(videoId);
            video.upView();
            httpSession.setAttribute("haveSeen", haveSeen);
        }

        User user = sessionUser!=null? userRepository.findByEmail(sessionUser.getEmail()).orElse(null): null;
        boolean isLiked = user!=null? !likeVideoRepository.findByUserAndVideo(user,video).isEmpty() : false;

        return VideoInfosDto.builder()
                .createdDate(video.getCreatedDate())
                .isLiked(isLiked)
                .isSubs(false)
                .likes(Long.valueOf(video.getLikes()))
                .title(video.getTitle())
                .views(video.getViews())
                .description(video.getDescription())
                .userInfoDto(video.getUser().toSimpleInfoDto())
                .build();
    }

    @Transactional
    public Long likeVideo(Long videoId, SessionUser sessionUser, String comamnd){
        Video video = videoRepository.findById(videoId).get();
        if(video == null || sessionUser == null)
            return -1L;
        User user = userRepository.findByEmail(sessionUser.getEmail()).get();
        if(comamnd.equals("post")){
            likeVideoRepository.save(LikeVideo.builder()
                    .video(video)
                    .user(user)
                    .build()
            );
        }else{
            likeVideoRepository.deleteByUserAndVideo(user, video);
        }
        Long likes  = likeVideoRepository.countByVideo(video);
        video.setLikes(likes);
        return likes;
    }








    @Transactional(readOnly = true)
    public ResponseEntity<ResourceRegion> getVideoRegion(String rangeHeader , Long videoId, Long quality) throws IOException {
        Video video = videoRepository.findById(videoId).get();
        FileUrlResource videoResource = new FileUrlResource(video.getVideoUrlMap().get(quality));
        ResourceRegion resourceRegion = getResourceRegion(videoResource, rangeHeader);

        return ResponseEntity.status(HttpStatus.PARTIAL_CONTENT)
                .contentType(MediaTypeFactory.getMediaType(videoResource).orElse(MediaType.APPLICATION_OCTET_STREAM))
                .body(resourceRegion);
    }

    private ResourceRegion getResourceRegion(UrlResource video, String httpHeaders) throws IOException {
        ResourceRegion resourceRegion = null;

        long contentLength = video.contentLength();
        int fromRange = 0;
        int toRange = 0;
        if (StringUtils.isNotBlank(httpHeaders)) {
            String[] ranges = httpHeaders.substring("bytes=".length()).split("-");
            fromRange = Integer.valueOf(ranges[0]);
            if (ranges.length > 1) {
                toRange = Integer.valueOf(ranges[1]);
            } else {
                toRange = (int) (contentLength - 1);
            }
        }

        if (fromRange > 0) {
            long rangeLength = Math.min(CHUNK_SIZE, toRange - fromRange + 1);
            resourceRegion = new ResourceRegion(video, fromRange, rangeLength);
        } else {
            long rangeLength = Math.min(CHUNK_SIZE, contentLength);
            resourceRegion = new ResourceRegion(video, 0, rangeLength);
        }

        return resourceRegion;
    }

}
