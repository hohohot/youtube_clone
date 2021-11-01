package com.kc.portfolio.mytube.service;


import com.kc.portfolio.mytube.config.auth.dto.SessionUser;
import com.kc.portfolio.mytube.domain.comments.Comment;
import com.kc.portfolio.mytube.domain.comments.CommentRepository;
import com.kc.portfolio.mytube.domain.comments.Reply;
import com.kc.portfolio.mytube.domain.comments.ReplyRepository;
import com.kc.portfolio.mytube.domain.like.comment.LikeComment;
import com.kc.portfolio.mytube.domain.like.comment.LikeCommentRepository;
import com.kc.portfolio.mytube.domain.like.reply.LikeReply;
import com.kc.portfolio.mytube.domain.like.reply.LikeReplyRepository;
import com.kc.portfolio.mytube.domain.like.video.LikeVideo;
import com.kc.portfolio.mytube.domain.user.User;
import com.kc.portfolio.mytube.domain.user.UserRepository;
import com.kc.portfolio.mytube.domain.video.Video;
import com.kc.portfolio.mytube.domain.video.VideoRepository;
import com.kc.portfolio.mytube.web.dto.CommentsDto;
import com.kc.portfolio.mytube.web.dto.ReplysDto;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.mail.Session;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class CommentService {
    private final CommentRepository commentRepository;
    private final ReplyRepository replyRepository;
    private final UserRepository userRepository;
    private final VideoRepository videoRepository;
    private final LikeCommentRepository likeCommentRepository;
    private final LikeReplyRepository likeReplyRepository;

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

    @Transactional
    public Long createReply(SessionUser sessionUser, Long commentId, Long videoId, String replyContent){
        if(sessionUser == null) return -1L;
        User user =  userRepository.findByEmail(sessionUser.getEmail()).get();
        Comment comment = commentRepository.findById(commentId).get();
        Video video = videoRepository.findById(videoId).get();
        return replyRepository.save(
                Reply.builder()
                        .comment(comment)
                        .content(replyContent)
                        .video(video)
                        .user(user)
                        .build()
        ).getId();
    }

    @Transactional(readOnly = true)
    public Long howManyComment(Long videoId){
        Comment comment = Comment.builder().video(videoRepository.findById(videoId).get()).build();
        Reply reply = Reply.builder().video(videoRepository.findById(videoId).get()).build();
        return commentRepository.count(Example.of(comment))+replyRepository.count(Example.of(reply));
    }


    @Transactional(readOnly = true)
    public List<CommentsDto> getComments(Long videoId, SessionUser sessionUser){
        final User user;
        if(sessionUser != null)
            user = userRepository.findByEmail(sessionUser.getEmail()).get();
        else
            user = null;
        return commentRepository.findByVideoId(videoId).stream()
                .map(c -> {
                    boolean isLiked = false;
                    if(user != null){
                        isLiked = !likeCommentRepository.findByUserAndComment(user, c).isEmpty();
                    }
                    return CommentsDto.builder()
                        .content(c.getContent())
                        .isLiked(isLiked)
                        .likes(c.getLikes())
                        .createdDate(c.getCreatedDate())
                        .userInfoDto(c.getUser().toSimpleInfoDto())
                        .commentId(c.getId())
                        .build();
                }).sorted(Comparator.comparing(p->p.getCreatedDate())).collect(Collectors.toList());
    }


    @Transactional(readOnly = true)
    public List<ReplysDto> getReplys(Long commentId, SessionUser sessionUser){
        final User user;
        if(sessionUser != null)
            user = userRepository.findByEmail(sessionUser.getEmail()).get();
        else
            user = null;
        return replyRepository.findByCommentId(commentId).stream()
                .map(c -> {
                    boolean isLiked = false;
                    if(user != null){
                        isLiked = !likeReplyRepository.findByUserAndReply(user, c).isEmpty();
                    }
                    return ReplysDto.builder()
                            .content(c.getContent())
                            .isLiked(isLiked)
                            .likes(c.getLikes())
                            .createdDate(c.getCreatedDate())
                            .userInfoDto(c.getUser().toSimpleInfoDto())
                            .replyId(c.getId())
                            .build();
                }).sorted(Comparator.comparing(p->p.getCreatedDate())).collect(Collectors.toList());
    }


    @Transactional
    public Long likeComemnt(Long commentId, SessionUser sessionUser, String comamnd){
        Comment comment = commentRepository.findById(commentId).get();
        if(comment == null || sessionUser == null)
            return -1L;
        User user = userRepository.findByEmail(sessionUser.getEmail()).get();
        if(comamnd.equals("post")){
            likeCommentRepository.save(LikeComment.builder()
                    .comment(comment)
                    .user(user)
                    .build()
            );
        }else{
            likeCommentRepository.deleteByUserAndComment(user, comment);
        }
        Long likes  = likeCommentRepository.countByComment(comment);
        comment.setLikes(likes);
        return likes;
    }

    @Transactional
    public Long likeReply(Long replyId, SessionUser sessionUser, String comamnd){
        Reply reply = replyRepository.findById(replyId).get();
        if(reply == null || sessionUser == null)
            return -1L;
        User user = userRepository.findByEmail(sessionUser.getEmail()).get();
        if(comamnd.equals("post")){
            likeReplyRepository.save(LikeReply.builder()
                    .reply(reply)
                    .user(user)
                    .build()
            );
        }else{
            likeReplyRepository.deleteByUserAndReply(user, reply);
        }
        Long likes  = likeReplyRepository.countByReply(reply);
        reply.setLikes(likes);
        return likes;
    }



}
