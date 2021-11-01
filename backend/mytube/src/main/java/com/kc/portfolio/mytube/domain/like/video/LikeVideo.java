package com.kc.portfolio.mytube.domain.like.video;


import com.kc.portfolio.mytube.domain.user.User;
import com.kc.portfolio.mytube.domain.video.Video;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@NoArgsConstructor
@Getter
@Entity
@Table(
        uniqueConstraints={
                @UniqueConstraint(
                        columnNames={"user_id","video_id"}
                )
        }
)
public class LikeVideo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @ManyToOne
    @JoinColumn
    private User user;

    @ManyToOne
    @JoinColumn
    private Video video;

    @Builder
    public LikeVideo(User user, Video video) {
        this.user = user;
        this.video = video;
    }
}
