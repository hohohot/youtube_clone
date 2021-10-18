package com.kc.portfolio.mytube.web.controller;

import com.kc.portfolio.mytube.config.auth.dto.SessionUser;
import com.kc.portfolio.mytube.service.CommentService;
import com.kc.portfolio.mytube.web.dto.CommentsDto;
import com.kc.portfolio.mytube.web.dto.ReplysDto;
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

    @PostMapping("/comments/postreplys")
    public @ResponseBody Long createReply(
            @RequestParam("replyContent") String replyContent,
            @RequestParam("commentId") Long commentId,
            @RequestParam("videoId") Long videoId){
        System.out.println(videoId);
        return commentService.createReply(
                (SessionUser) httpSession.getAttribute("userInfo"), commentId,
                videoId, replyContent);
    }

    @GetMapping("/comments/getcomments/{id}")
    public @ResponseBody List<CommentsDto> getComments(@PathVariable("id") Long videoId){
        return commentService.getComments(videoId);
    }


    @GetMapping("/comments/getreplys/{id}")
    public @ResponseBody List<ReplysDto> getReplys(@PathVariable("id") Long replyId){
        return commentService.getReplys(replyId);
    }

    @GetMapping("/comments/howmany/{id}")
    public @ResponseBody Long getCommentsNum(@PathVariable("id") Long videoId){
        return commentService.howManyComment(videoId);
    }
}
