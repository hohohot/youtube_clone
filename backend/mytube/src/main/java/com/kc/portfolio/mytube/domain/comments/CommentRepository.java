package com.kc.portfolio.mytube.domain.comments;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    @Query( "select o from Comment o where videoId = :id" )
    List<Comment> findByVideoIds(@Param("id") Long VideoId);
}
