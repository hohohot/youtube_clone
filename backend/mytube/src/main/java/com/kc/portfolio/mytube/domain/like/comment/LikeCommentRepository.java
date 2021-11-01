package com.kc.portfolio.mytube.domain.like.comment;

import com.kc.portfolio.mytube.domain.comments.Comment;
import com.kc.portfolio.mytube.domain.user.User;
import com.kc.portfolio.mytube.domain.video.Video;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LikeCommentRepository extends JpaRepository<LikeComment, Long> {
    Optional<LikeComment> findByUserAndComment(User user, Comment comment);
    Long deleteByUserAndComment(User user, Comment comment);
    Long countByComment(Comment comment);
}
