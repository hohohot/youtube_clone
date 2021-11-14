package com.kc.portfolio.mytube.config.auth;

import com.kc.portfolio.mytube.domain.user.Role;
import lombok.RequiredArgsConstructor;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

@RequiredArgsConstructor
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private final CustomOAuth2UserService customOAuth2UserService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .headers().frameOptions().disable()
                .and()
                .authorizeRequests()
                .antMatchers("/comments/postcomments", "/comments/postreplys", "/like_reply/**", "/like_comment/**", "/like_video**", "/postvideo", "/userInfo").authenticated()
                .antMatchers("/api/v1/**").hasRole(Role.USER.name())
                .anyRequest().permitAll()
                .and()
                .logout()
                .logoutSuccessUrl("/")
                .and()
                .oauth2Login()
                .userInfoEndpoint()
                .userService(customOAuth2UserService);


        //.antMatchers("/comments/postcomments", "/comments/postreplys", "/like_reply/**", "/like_comment/**", "/like_video**", "/postvideo").authenticated()
        //.antMatchers("/", "recommending_videos/**", "/css/**", "/img/**", "/js/**", "/h2-console/**", "/profile").authenticated()
    }
}