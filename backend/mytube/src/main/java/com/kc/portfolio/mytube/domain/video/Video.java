package com.kc.portfolio.mytube.domain.video;

import com.kc.portfolio.mytube.MytubeApplication;
import com.kc.portfolio.mytube.domain.BaseTimeEntity;
import com.kc.portfolio.mytube.domain.user.User;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import net.bramp.ffmpeg.FFprobe;
import net.bramp.ffmpeg.probe.FFmpegFormat;
import net.bramp.ffmpeg.probe.FFmpegProbeResult;

import javax.persistence.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


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
    private Long views = 0L;

    @Column
    private String thumbnailUrl;
    @Column
    private String videoPath;

    @Column
    private Long likes = 0L;

    @Builder
    public Video(User user, String titile, String description, Long videoLength, String thumbnailUrl) {
        this.user = user;
        this.titile = titile;
        this.description = description;
        this.videoLength = videoLength;
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
            FFprobe ffprobe = new FFprobe(MytubeApplication.FFPROBE);  //리눅스에 설치되어 있는 ffmpeg 폴더
            System.out.println();
            FFmpegProbeResult probeResult = ffprobe.probe(this.videoPath);
            FFmpegFormat format = probeResult.getFormat();
            Double second = format.duration;    //초단위

            videoLength = second.longValue();

        } catch(IOException e) {
            videoLength = 0L;
        }
    }

    public void extractThumbnail() {
        String tempUrl = System.getProperty("user.dir") + MytubeApplication.VIDEO_PATH + "/" + id + "/extracted.png";
        String str = null;
        String[] cmd = new String[] {MytubeApplication.FFMPEG
                , "-i", "\""+videoPath + "\"", "-vcodec", "png"
                , "-vframes", "1", "-vf", "thumbnail=100"
                , "\""+tempUrl+"\""};
        Process process = null;

        try{
            process = new ProcessBuilder(cmd).start();
            // 외부 프로그램의 표준출력 상태 버퍼에 저장
            BufferedReader stdOut = new BufferedReader( new InputStreamReader(process.getInputStream()) );
            // 표준출력 상태를 출력
            while( (str = stdOut.readLine()) != null ) {
                System.out.println(str);
            }
            thumbnailUrl = tempUrl;
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void upView(){
        this.views++;
    }

    public void setLikes(Long likes){
        this.likes = likes;
    }

}
