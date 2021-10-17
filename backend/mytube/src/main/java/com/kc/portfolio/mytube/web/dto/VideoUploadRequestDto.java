package com.kc.portfolio.mytube.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
@NoArgsConstructor
public class VideoUploadRequestDto {
    private String title;
    private String description;


    @Builder
    public VideoUploadRequestDto(String title, String description) {
        this.title = title;
        this.description = description;
    }
}
