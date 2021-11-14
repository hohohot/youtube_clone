package com.kc.portfolio.mytube.domain.video;

import com.kc.portfolio.mytube.MytubeApplication;
import com.kc.portfolio.mytube.domain.BaseTimeEntity;
import com.kc.portfolio.mytube.domain.user.User;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import net.bramp.ffmpeg.FFmpeg;
import net.bramp.ffmpeg.FFprobe;
import net.bramp.ffmpeg.builder.FFmpegBuilder;
import net.bramp.ffmpeg.probe.FFmpegFormat;
import net.bramp.ffmpeg.probe.FFmpegProbeResult;
import org.springframework.beans.factory.annotation.Value;

import javax.imageio.ImageIO;
import javax.persistence.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.List;


@Getter
@NoArgsConstructor
@Entity
public class Video extends BaseTimeEntity {

    public static final Long RESOLUTIONS[] = {144L, 240L, 360L, 480L, 720L, 1080L};

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn
    private User user;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String description;

    @Column
    private Long videoLength;

    @Column
    private Long views = 0L;

    @Column
    private String thumbnailUrl;

    @ElementCollection
    @JoinTable(name="VIDEO_URL_MAP", joinColumns=@JoinColumn(name="ID"))
    @MapKeyColumn (name="RESOLUTION")
    @Column(name="URL_COLUMN")
    private Map<Long, String> videoUrlMap = new HashMap<>();

    @Column
    private Long likes = 0L;

    @Builder
    public Video(User user, String title, String description, Long videoLength, String thumbnailUrl) {
        this.user = user;
        this.title = title;
        this.description = description;
        this.videoLength = videoLength;
        this.thumbnailUrl = thumbnailUrl;
    }



    public void setThumbnail(String thumbnailUrl){
        this.thumbnailUrl = thumbnailUrl;
    }
    public void addVideoUrl(String videoPath, Long resolution){
        videoUrlMap.put(resolution, videoPath);
    }
    public void updateRunningTime(String path, String ffprobePath){
        try {
            System.out.println("ffprobePath");
            System.out.println(ffprobePath);
            FFprobe ffprobe = new FFprobe(ffprobePath);  //리눅스에 설치되어 있는 ffmpeg 폴더
            System.out.println();
            FFmpegProbeResult probeResult = ffprobe.probe(path);
            FFmpegFormat format = probeResult.getFormat();
            Double second = format.duration;    //초단위

            videoLength = second.longValue();

        } catch(IOException e) {
            videoLength = 0L;
        }
    }

    public void extractThumbnail(String path, String ffmpegPath) throws IOException {
        System.out.println("------------------extract Thumbnail Start------------------");
        String tempUrl = System.getProperty("user.dir") + MytubeApplication.VIDEO_PATH + "/" + id + "/extracted.png";
        String str = null;
        FFmpeg fFmpeg = new FFmpeg(ffmpegPath);
        FFmpegBuilder fFmpegBuilder = new FFmpegBuilder();
        fFmpegBuilder
                .setInput(path)
                .addOutput(tempUrl)
                .setVideoCodec("png")
                .setFrames(1)
                .setVideoFilter("thumbnail=100");
        try{
            fFmpeg.run(fFmpegBuilder);
            thumbnailUrl = tempUrl;
        }
        catch (IOException e) {
            System.out.println("error ffmpeg");
            e.printStackTrace();
        }
        System.out.println("------------------extract Thumbnail End------------------");
    }

    public void postProcesThumbnail() throws IOException {
        int WIDTH = 720;
        int HEIGHT = 404;
        Image image = ImageIO.read(new File(this.thumbnailUrl));
        int width = image.getWidth(null);
        int height = image.getHeight(null);

        if (WIDTH * height / width > HEIGHT) {
            width = HEIGHT * width / height;
            height = HEIGHT;
        } else {
            height = WIDTH * height / width;
            width = WIDTH;
        }
        image = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        BufferedImage bufferedImage = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
        Graphics g = bufferedImage.getGraphics();

        g.setColor(Color.BLACK);
        g.drawRect(0, 0, WIDTH, HEIGHT);
        g.drawImage(image, (WIDTH - width) / 2, (HEIGHT - height) / 2, null);
        ImageIO.write(bufferedImage, this.thumbnailUrl.substring(this.thumbnailUrl.length() - 3), new File(this.thumbnailUrl));
    }

    public void upView(){
        this.views++;
    }

    public void setLikes(Long likes){
        this.likes = likes;
    }

}
