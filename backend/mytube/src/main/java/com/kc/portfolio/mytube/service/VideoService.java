package com.kc.portfolio.mytube.service;


import com.kc.portfolio.mytube.MytubeApplication;
import com.kc.portfolio.mytube.config.auth.dto.SessionUser;
import com.kc.portfolio.mytube.domain.user.UserRepository;
import com.kc.portfolio.mytube.domain.video.Video;
import com.kc.portfolio.mytube.domain.video.VideoRepository;
import com.kc.portfolio.mytube.domain.video.VideoUrl;
import com.kc.portfolio.mytube.domain.video.VideoUrlRepository;
import com.kc.portfolio.mytube.web.dto.VideoInfoListItemDto;
import com.kc.portfolio.mytube.web.dto.VideoInfosDto;
import com.kc.portfolio.mytube.web.dto.VideoUploadRequestDto;
import com.nimbusds.oauth2.sdk.util.StringUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.FileUrlResource;
import org.springframework.core.io.UrlResource;
import org.springframework.core.io.support.ResourceRegion;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.MediaTypeFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class VideoService {
    private final VideoRepository videoRepository;
    private final VideoUrlRepository videoUrlRepository;
    private final UserRepository userRepository;
    private static final long CHUNK_SIZE = 1024*1024L;


    @Transactional(readOnly = true)
    public List<VideoInfoListItemDto> getRecommendedVideo(SessionUser user, Long page, Long size){
        PageRequest pageRequest = PageRequest.of(page.intValue(), size.intValue(), Sort.by("createdDate").descending());
        return videoRepository.findAll(pageRequest).stream()
                .map(v->VideoInfoListItemDto.builder()
                        .title(v.getTitile())
                        .userInfoDto(v.getUser().toSimpleInfoDto())
                        .thumbnailUrl("/thumbnail/" + v.getId())
                        .view(v.getViews())
                        .createdTime(v.getCreatedDate())
                        .modifiedTime(v.getModifiedDate())
                        .videoLength(v.getVideoLength())
                        .videoUrl("/video?id="+v.getId())
                        .build()
                ).collect(Collectors.toList());
    }

    @Transactional
    public String uploadVideo(MultipartFile videoFile, MultipartFile thumbnail,
                              VideoUploadRequestDto requestDto, SessionUser user){
        String rootPath = System.getProperty("user.dir");
        Video video = videoRepository.save(Video.builder()
                .titile(requestDto.getTitle())
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

        try {
            videoFile.transferTo(
                    new File(videoFilePath));
            thumbnail.transferTo(
                    new File(thumbnailFilePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
        video.setThumbnail(thumbnailFilePath);
        video.setVideoPath(videoFilePath);
        videoUrlRepository.save(
                VideoUrl.builder()
                .video(video)
                .filepath(videoFilePath)
                .quality(999L)
                .build()
        );

        return "asdf";
    }

    @Transactional
    public byte[] loadThumbnail(Long videoId){
       String filePath = videoRepository.findById(videoId).get().getThumbnailUrl();
        try {
            return Files.readAllBytes(new File(filePath).toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public VideoInfosDto getVideoInfos(Long videoId, SessionUser user){
        Video video = videoRepository.findById(videoId).get();
        return VideoInfosDto.builder()
                .createdDate(video.getCreatedDate())
                .isLiked(false)
                .isSubs(false)
                .likes(0L)
                .title(video.getTitile())
                .views(video.getViews())
                .description(video.getDescription())
                .userInfoDto(video.getUser().toSimpleInfoDto())
                .build();
    }








    public ResponseEntity<ResourceRegion> getVideoRegion(String rangeHeader , Long videoId) throws IOException {
        Video video = videoRepository.findById(videoId).get();
        FileUrlResource videoResource = new FileUrlResource(video.getVideoPath());
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
