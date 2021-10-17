package com.kc.portfolio.mytube;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.io.File;


@EnableJpaAuditing
@SpringBootApplication
public class MytubeApplication {

	public static final String DYNAMIC_RESOURCE = "/dynamicResource";
	public static final String VIDEO_PATH = DYNAMIC_RESOURCE+"/videos";

	public static void initializeFolder(){
		if (!new File(DYNAMIC_RESOURCE).exists()) {
			try{
				new File(DYNAMIC_RESOURCE).mkdir();
			}
			catch(Exception e){
				e.getStackTrace();
			}
		}

		if (!new File(VIDEO_PATH).exists()) {
			try{
				new File(VIDEO_PATH).mkdir();
			}
			catch(Exception e){
				e.getStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		initializeFolder();
		SpringApplication.run(MytubeApplication.class, args);
	}

}
