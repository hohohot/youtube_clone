package com.kc.portfolio.mytube.domain.like.reply;


import com.kc.portfolio.mytube.domain.comments.Comment;
import com.kc.portfolio.mytube.domain.comments.Reply;
import com.kc.portfolio.mytube.domain.user.User;
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
                        columnNames={"user_id","reply_id"}
                )
        }
)
public class LikeReply {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @ManyToOne
    @JoinColumn
    private User user;

    @ManyToOne
    @JoinColumn
    private Reply reply;

    @Builder
    public LikeReply(User user, Reply reply) {
        this.user = user;
        this.reply = reply;
    }

}
