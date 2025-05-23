package com.blogger.group.blogger_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class BloggerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BloggerAppApplication.class, args);
	}

}
