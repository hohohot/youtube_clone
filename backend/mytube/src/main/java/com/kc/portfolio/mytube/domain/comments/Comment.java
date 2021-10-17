package com.kc.portfolio.mytube.domain.comments;


import com.kc.portfolio.mytube.domain.BaseTimeEntity;
import com.kc.portfolio.mytube.domain.user.User;
import com.kc.portfolio.mytube.domain.video.Video;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@NoArgsConstructor
@Getter
@Entity
public class Comment extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn
    private User user;

    @ManyToOne
    @JoinColumn
    private Video video;

    @Column
    private String content;

    @Builder

    public Comment(User user, Video video, String content) {
        this.user = user;
        this.video = video;
        this.content = content;
    }
}
