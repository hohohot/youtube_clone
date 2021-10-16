package com.kc.portfolio.mytube.web.dto;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class UserInfoDto {
    String userName;
    String email;
    String profileUrl;

    @Builder
    public UserInfoDto(String userName, String email, String profileUrl) {
        this.userName = userName;
        this.email = email;
        this.profileUrl = profileUrl;
    }
}
