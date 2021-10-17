package com.kc.portfolio.mytube.domain.video;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

public interface VideoRepository extends JpaRepository<Video, Long> {

}
