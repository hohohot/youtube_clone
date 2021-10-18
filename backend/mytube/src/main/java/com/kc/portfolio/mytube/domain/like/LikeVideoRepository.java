package com.kc.portfolio.mytube.domain.like;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LikeVideoRepository extends JpaRepository<LikeVideo, Long> {
}
