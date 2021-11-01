package com.kc.portfolio.mytube.domain.like.comment;


import com.kc.portfolio.mytube.domain.comments.Comment;
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
                        columnNames={"user_id","comment_id"}
                )
        }
)
public class LikeComment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @ManyToOne
    @JoinColumn
    private User user;

    @ManyToOne
    @JoinColumn
    private Comment comment;

    @Builder
    public LikeComment(User user, Comment comment) {
        this.user = user;
        this.comment = comment;
    }
}
