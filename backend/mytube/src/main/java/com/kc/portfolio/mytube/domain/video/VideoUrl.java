package com.kc.portfolio.mytube.domain.video;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class VideoUrl {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn
    private Video video;

    @Column(nullable = false)
    private Long quality;

    @Column(nullable = false)
    private String filepath;

    @Builder
    public VideoUrl(Video video, Long quality, String filepath) {
        this.video = video;
        this.quality = quality;
        this.filepath = filepath;
    }
}
