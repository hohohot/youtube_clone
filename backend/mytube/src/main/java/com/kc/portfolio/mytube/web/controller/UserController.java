package com.kc.portfolio.mytube.web.controller;


import com.kc.portfolio.mytube.config.auth.dto.SessionUser;
import com.kc.portfolio.mytube.web.dto.UserInfoDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.Session;
import javax.servlet.http.HttpSession;

@RequiredArgsConstructor
@RestController
public class UserController {
    private final HttpSession httpSession;

    @GetMapping("/userInfo")
    public UserInfoDto simpleInfo(){
        SessionUser user = (SessionUser)httpSession.getAttribute("userInfo");
        if(user == null)
            return null;
        return UserInfoDto.builder()
                .userName(user.getName())
                .email(user.getEmail())
                .profileUrl(user.getPicture())
                .build();
    }
}
