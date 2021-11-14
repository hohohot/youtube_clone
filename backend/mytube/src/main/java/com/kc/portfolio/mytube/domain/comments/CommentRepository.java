package com.kc.portfolio.mytube.domain.comments;

import com.kc.portfolio.mytube.domain.video.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByVideoId(Long videoId);
    Long countByVideoId(Long videoId);
}
