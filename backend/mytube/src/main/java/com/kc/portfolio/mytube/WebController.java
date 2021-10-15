package com.kc.portfolio.mytube;

import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Getter
@Controller
public class WebController {

    @GetMapping("/*")
    public String mainPage(){
        System.out.println("hello");
        return "index";
    }



}
