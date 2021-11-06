package com.kc.portfolio.mytube.domain.video;

import com.kc.portfolio.mytube.MytubeApplication;
import com.kc.portfolio.mytube.domain.BaseTimeEntity;
import com.kc.portfolio.mytube.domain.user.User;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import net.bramp.ffmpeg.FFmpeg;
import net.bramp.ffmpeg.FFprobe;
import net.bramp.ffmpeg.probe.FFmpegFormat;
import net.bramp.ffmpeg.probe.FFmpegProbeResult;

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
    public void updateRunningTime(String path){
        try {
            FFprobe ffprobe = new FFprobe(MytubeApplication.FFPROBE);  //리눅스에 설치되어 있는 ffmpeg 폴더

            System.out.println();
            FFmpegProbeResult probeResult = ffprobe.probe(path);
            FFmpegFormat format = probeResult.getFormat();
            System.out.println("probeResult.getStreams().get(0).profile");
            System.out.println(probeResult.getStreams().get(0).profile);
            System.out.println(probeResult.getStreams().get(0).codec_long_name);
            System.out.println(probeResult.getStreams().get(0).codec_tag);

            Double second = format.duration;    //초단위

            videoLength = second.longValue();

        } catch(IOException e) {
            videoLength = 0L;
        }
    }

    public void extractThumbnail(String path) {
        String tempUrl = System.getProperty("user.dir") + MytubeApplication.VIDEO_PATH + "/" + id + "/extracted.png";
        String str = null;
        String[] cmd = new String[] {MytubeApplication.FFMPEG
                , "-i", "\""+path + "\"", "-vcodec", "png"
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
