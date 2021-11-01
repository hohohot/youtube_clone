package com.kc.portfolio.mytube.domain.like.reply;

import com.kc.portfolio.mytube.domain.comments.Comment;
import com.kc.portfolio.mytube.domain.comments.Reply;
import com.kc.portfolio.mytube.domain.like.comment.LikeComment;
import com.kc.portfolio.mytube.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LikeReplyRepository extends JpaRepository<LikeReply, Long> {
    Optional<LikeReply> findByUserAndReply(User user, Reply reply);
    Long deleteByUserAndReply(User user, Reply reply);
    Long countByReply(Reply reply);
}
