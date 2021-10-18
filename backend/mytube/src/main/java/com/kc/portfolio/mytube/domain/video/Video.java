package com.kc.portfolio.mytube.domain.video;

import com.kc.portfolio.mytube.domain.BaseTimeEntity;
import com.kc.portfolio.mytube.domain.user.User;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import net.bramp.ffmpeg.FFprobe;
import net.bramp.ffmpeg.probe.FFmpegFormat;
import net.bramp.ffmpeg.probe.FFmpegProbeResult;

import javax.persistence.*;
import java.io.IOException;


@Getter
@NoArgsConstructor
@Entity
public class Video extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn
    private User user;

    @Column(nullable = false)
    private String titile;

    @Column(nullable = false)
    private String description;

    @Column
    private Long videoLength;

    @Column
    private Long views;

    @Column
    private String thumbnailUrl;
    @Column
    private String videoPath;

    @Builder
    public Video(User user, String titile, String description, Long videoLength, Long views, String thumbnailUrl) {
        this.user = user;
        this.titile = titile;
        this.description = description;
        this.videoLength = videoLength;
        this.views = 0L;
        this.thumbnailUrl = thumbnailUrl;
    }



    public void setThumbnail(String thumbnailUrl){
        this.thumbnailUrl = thumbnailUrl;
    }
    public void setVideoPath(String videoPath){
        this.videoPath = videoPath;
        this.updateRunningTime();
    }
    public void updateRunningTime(){
        try {
            FFprobe ffprobe = new FFprobe("C:\\ffmpeg\\ffmpeg-4.4-essentials_build\\ffmpeg-4.4-essentials_build\\bin\\ffprobe");  //리눅스에 설치되어 있는 ffmpeg 폴더
            System.out.println();
            FFmpegProbeResult probeResult = ffprobe.probe(this.videoPath);
            FFmpegFormat format = probeResult.getFormat();
            Double second = format.duration;    //초단위

            videoLength = second.longValue();

        } catch(IOException e) {
            videoLength = 0L;
        }
    }

    public void upView(){
        this.views++;
    }


}
