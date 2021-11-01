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
public class Reply extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn
    private User user;

    @ManyToOne
    @JoinColumn
    private Video video;

    @ManyToOne
    @JoinColumn
    private Comment comment;

    @Column
    private String content;


    @Column
    private Long likes = 0L;
    @Builder

    public Reply(User user, Video video, Comment comment, String content) {
        this.user = user;
        this.video = video;
        this.comment = comment;
        this.content = content;
    }


    public void setLikes(Long likes){
        this.likes = likes;
    }
}