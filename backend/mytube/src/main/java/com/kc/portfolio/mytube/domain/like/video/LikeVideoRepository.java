package com.kc.portfolio.mytube.domain.like.video;

import com.kc.portfolio.mytube.domain.user.User;
import com.kc.portfolio.mytube.domain.video.Video;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LikeVideoRepository extends JpaRepository<LikeVideo, Long> {
    Long deleteByUserAndVideo(User user, Video video);
    Optional<LikeVideo> findByUserAndVideo(User user, Video video);
    Long countByVideo(Video Video);
}
