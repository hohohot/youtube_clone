package com.kc.portfolio.mytube.web.controller;

import com.kc.portfolio.mytube.config.auth.dto.SessionUser;
import com.kc.portfolio.mytube.service.KeywordService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@RequiredArgsConstructor
@Controller
public class KeywordController {

    private final KeywordService keywordService;
    private final HttpSession httpSession;

    @GetMapping("/recommended_keywords")
    public @ResponseBody
    List<String> getRecommendedKeywords(@RequestParam("prefix")String prefix){
        SessionUser sessionUser = (SessionUser) httpSession.getAttribute("userInfo");
        return keywordService.getKeywords(prefix);
    }
}
