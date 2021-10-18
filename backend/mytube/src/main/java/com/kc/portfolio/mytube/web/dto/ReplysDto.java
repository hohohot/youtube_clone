package com.kc.portfolio.mytube.web.dto;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@Setter
public class ReplysDto {
    Long replyId;
    UserInfoDto userInfoDto;
    Long likes;
    Boolean isLiked;
    String content;
    LocalDateTime createdDate;

    @Builder
    public ReplysDto(Long replyId, UserInfoDto userInfoDto, Long likes, Boolean isLiked, String content, LocalDateTime createdDate) {
        this.replyId = replyId;
        this.userInfoDto = userInfoDto;
        this.likes = likes;
        this.isLiked = isLiked;
        this.content = content;
        this.createdDate = createdDate;
    }
}
