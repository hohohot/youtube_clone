package com.kc.portfolio.mytube.web.dto;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class LikeResponseDto {
    Long howManyLike;
    Boolean selected;

    @Builder
    public LikeResponseDto(Long howManyLike, Boolean selected) {
        this.howManyLike = howManyLike;
        this.selected = selected;
    }
}
