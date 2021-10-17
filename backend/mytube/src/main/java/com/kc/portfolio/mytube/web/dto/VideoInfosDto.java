package com.kc.portfolio.mytube.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;


@Getter
@Setter
@NoArgsConstructor
public class VideoInfosDto {
    String title;
    String description;
    Long likes;
    Long views;
    Boolean isLiked;
    LocalDateTime createdDate;
    UserInfoDto userInfoDto;
    Boolean isSubs;

    @Builder

    public VideoInfosDto(String title, String description, Long likes, Long views, Boolean isLiked, LocalDateTime createdDate, UserInfoDto userInfoDto, Boolean isSubs) {
        this.title = title;
        this.description = description;
        this.likes = likes;
        this.views = views;
        this.isLiked = isLiked;
        this.createdDate = createdDate;
        this.userInfoDto = userInfoDto;
        this.isSubs = isSubs;
    }
}
