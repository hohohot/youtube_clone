package com.kc.portfolio.mytube.web.controller;


import com.kc.portfolio.mytube.config.auth.dto.SessionUser;
import com.kc.portfolio.mytube.service.VideoService;
import com.kc.portfolio.mytube.web.dto.VideoInfoListItemDto;
import com.kc.portfolio.mytube.web.dto.VideoInfosDto;
import com.kc.portfolio.mytube.web.dto.VideoResolutionDto;
import com.kc.portfolio.mytube.web.dto.VideoUploadRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.support.ResourceRegion;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.mail.Session;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.util.List;

@RequiredArgsConstructor
@Controller
public class VideoController {
    private final VideoService videoService;
    private final HttpSession httpSession;
    @PostMapping("/postvideo")
    public String postVideo(@RequestParam MultipartFile video, @RequestParam MultipartFile thumbnail,
                            VideoUploadRequestDto requestDto) throws IOException {

        SessionUser user = (SessionUser)httpSession.getAttribute("userInfo");
        if(user == null)
            return "redirect:/error/usernotfound";
        System.out.println(System.getProperty("user.dir"));
        Long videoId = videoService.uploadVideo(video, thumbnail, requestDto, user);
        videoService.postProcess(videoId);
        return "redirect:/";
    }

    @GetMapping("/recommending_videos/{page}/{size}")
    public @ResponseBody List<VideoInfoListItemDto> recommemdingVideos(@PathVariable("page") Long page,
                                                                       @PathVariable("size") Long size,
                                                                       @RequestParam(value = "keyword", required = false) String keyword){
        System.out.println(keyword);
        SessionUser user = (SessionUser)httpSession.getAttribute("userInfo");
        return videoService.getRecommendedVideo(user, keyword, page, size);
    }

    /*@GetMapping("/recommending_videos/{page}/{size}")
    public @ResponseBody List<VideoInfoListItemDto> recommemdingVideos(@PathVariable("page") Long page,
                                                                       @PathVariable("size") Long size){
        SessionUser user = (SessionUser)httpSession.getAttribute("userInfo");
        return videoService.getRecommendedVideo(user, page, size);
    }*/

    @GetMapping(value = "thumbnail/{video_id}", produces = MediaType.IMAGE_JPEG_VALUE)
    public ResponseEntity<byte[]> getThumbnail(@PathVariable("video_id") Long videoId){
        return new ResponseEntity<byte[]>(videoService.loadThumbnail(videoId), HttpStatus.OK);
    }

    @GetMapping(value = "/streaming/{id}/{quality}", produces = "application/octet-stream")
    public ResponseEntity<ResourceRegion> getVideo(@RequestHeader(value = "Range", required = false) String rangeHeader,
                                                   @PathVariable("id") Long videoId,
                                                   @PathVariable("quality") Long quality)
            throws IOException {

        return videoService.getVideoRegion(rangeHeader, videoId, quality);

    }

    @PutMapping("like_video/{command}/{id}")
    public @ResponseBody Long likeVideo(@PathVariable("id") Long videoId, @PathVariable("command") String command){
        SessionUser user = (SessionUser) httpSession.getAttribute("userInfo");
        return videoService.likeVideo(videoId, user, command);
    }

    @GetMapping("/videoinfos/{id}")
    public @ResponseBody  VideoInfosDto getVideoInfos(@PathVariable("id") Long videoId){
        SessionUser user = (SessionUser) httpSession.getAttribute("userInfo");
        return videoService.getVideoInfos(videoId, user);
    }

    @GetMapping("/videoUrlList/{id}")
    public @ResponseBody  List<VideoResolutionDto> getVideoResolutions(@PathVariable("id") Long videoId){
        SessionUser user = (SessionUser) httpSession.getAttribute("userInfo");
        return videoService.getResolutions(videoId);
    }



}
