package com.kc.portfolio.mytube.domain.video;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface VideoRepository extends JpaRepository<Video, Long> {
    @Query("SELECT v FROM Video v WHERE lower(v.description) LIKE lower(concat('%',:keyword,'%')) OR  lower(v.title) LIKE lower(concat('%',:keyword,'%'))")
    List<Video> searchByKeyword(@Param("keyword") String keyword, Sort sort);

}
