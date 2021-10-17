package com.kc.portfolio.mytube.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;


@Getter
@Setter
@NoArgsConstructor
public class VideoInfoListItemDto {
    String title;
    UserInfoDto userInfoDto;
    String thumbnailUrl;
    String videoUrl;
    Long view;
    Long videoLength;
    LocalDateTime createdTime;
    LocalDateTime modifiedTime;

    @Builder

    public VideoInfoListItemDto(String title, UserInfoDto userInfoDto, String thumbnailUrl, String videoUrl, Long view, Long videoLength, LocalDateTime createdTime, LocalDateTime modifiedTime) {
        this.title = title;
        this.userInfoDto = userInfoDto;
        this.thumbnailUrl = thumbnailUrl;
        this.videoUrl = videoUrl;
        this.view = view;
        this.videoLength = videoLength;
        this.createdTime = createdTime;
        this.modifiedTime = modifiedTime;
    }
}
