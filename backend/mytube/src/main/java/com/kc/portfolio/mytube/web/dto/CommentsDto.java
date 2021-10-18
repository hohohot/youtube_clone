package com.kc.portfolio.mytube.web.dto;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@Setter
public class CommentsDto {
    Long commentId;
    UserInfoDto userInfoDto;
    Long likes;
    Boolean isLiked;
    String content;
    LocalDateTime createdDate;

    @Builder

    public CommentsDto(Long commentId, UserInfoDto userInfoDto, Long likes, Boolean isLiked, String content, LocalDateTime createdDate) {
        this.commentId = commentId;
        this.userInfoDto = userInfoDto;
        this.likes = likes;
        this.isLiked = isLiked;
        this.content = content;
        this.createdDate = createdDate;
    }
}
