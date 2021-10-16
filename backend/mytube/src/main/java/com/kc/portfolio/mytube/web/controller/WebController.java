package com.kc.portfolio.mytube.web.controller;

import com.kc.portfolio.mytube.config.auth.dto.SessionUser;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@RequiredArgsConstructor
@Getter
@Controller
public class WebController {
    private final HttpSession httpSession;

    @GetMapping("/")
    public String mainPage(Model model, HttpSession httpSession){
        System.out.println("hello");
        if(httpSession.getAttribute("userName")!=null)
            System.out.println(httpSession.getAttribute("userName"));
        return "index";
    }



}
