package com.kc.portfolio.mytube.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class VideoResolutionDto {
    String src;
    String type;
    String label;
    @Builder
    public VideoResolutionDto(String src, String type, String label) {
        this.src = src;
        this.type = type;
        this.label = label;
    }
}
