package com.kc.portfolio.mytube.service;


import com.kc.portfolio.mytube.config.auth.dto.SessionUser;
import com.kc.portfolio.mytube.domain.comments.Comment;
import com.kc.portfolio.mytube.domain.comments.CommentRepository;
import com.kc.portfolio.mytube.domain.comments.ReplyRepository;
import com.kc.portfolio.mytube.domain.user.User;
import com.kc.portfolio.mytube.domain.user.UserRepository;
import com.kc.portfolio.mytube.domain.video.Video;
import com.kc.portfolio.mytube.domain.video.VideoRepository;
import com.kc.portfolio.mytube.web.dto.CommentsDto;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.mail.Session;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class CommentService {
    private final CommentRepository commentRepository;
    private final ReplyRepository replyRepository;
    private final UserRepository userRepository;
    private final VideoRepository videoRepository;

    @Transactional
    public Long createComment(SessionUser sessionUser, Long videoId, String commentContent){
        if(sessionUser == null) return -1L;
        User user =  userRepository.findByEmail(sessionUser.getEmail()).get();
        Video video = videoRepository.findById(videoId).get();
        return commentRepository.save(
                Comment.builder()
                        .video(video)
                        .content(commentContent)
                        .user(user)
                        .build()
        ).getId();
    }

    @Transactional(readOnly = true)
    public List<CommentsDto> getComments(Long videoId, Long page, Long size){
        PageRequest pageRequest = PageRequest.of(page.intValue(), size.intValue(), Sort.by("createdDate").descending());
        return commentRepository.findAll(pageRequest).stream()
                .map(c -> CommentsDto.builder()
                        .content(c.getContent())
                        .isLiked(false)
                        .likes(0L)
                        .createdDate(c.getCreatedDate())
                        .userInfoDto(c.getUser().toSimpleInfoDto())
                        .build()
                ).collect(Collectors.toList());
    }



}
