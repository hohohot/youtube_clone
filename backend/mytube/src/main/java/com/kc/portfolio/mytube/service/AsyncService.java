package com.kc.portfolio.mytube.service;

import com.kc.portfolio.mytube.MytubeApplication;
import com.kc.portfolio.mytube.domain.video.Video;
import com.kc.portfolio.mytube.domain.video.VideoRepository;
import lombok.RequiredArgsConstructor;
import net.bramp.ffmpeg.FFmpeg;
import net.bramp.ffmpeg.FFprobe;
import net.bramp.ffmpeg.builder.FFmpegBuilder;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

@RequiredArgsConstructor
@Service
public class AsyncService {
    private final VideoRepository videoRepository;
    @Transactional
    @Async public void run(Runnable runnable) { runnable.run(); }
}
