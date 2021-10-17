package com.kc.portfolio.mytube.web.controller;

import com.kc.portfolio.mytube.config.auth.dto.SessionUser;
import com.kc.portfolio.mytube.service.CommentService;
import com.kc.portfolio.mytube.web.dto.CommentsDto;
import jdk.dynalink.linker.LinkerServices;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@RequiredArgsConstructor
@Controller
public class CommentController {
    private final CommentService commentService;
    private final HttpSession httpSession;


    @PostMapping("/comments/postcomments")
    public @ResponseBody Long createComment(
            @RequestParam("commentContent") String commentContent,
            @RequestParam("videoId") Long videoId){
        System.out.println(videoId);
        return commentService.createComment(
                (SessionUser) httpSession.getAttribute("userInfo"),
                videoId, commentContent);
    }

    @GetMapping("/comments/getcomments/{id}/{page}/{size}")
    public List<CommentsDto> getComments(@PathVariable("id") Long videoId,
                                         @PathVariable("page") Long page,
                                         @PathVariable("size") Long size
                                         ){
        return commentService.getComments(videoId, page, size);
    }




}
