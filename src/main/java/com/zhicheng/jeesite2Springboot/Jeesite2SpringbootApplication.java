package com.zhicheng.jeesite2Springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Jeesite2SpringbootApplication  extends SpringBootServletInitializer {


	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Jeesite2SpringbootApplication.class);
	}


	public static void main(String[] args) {
		SpringApplication.run(Jeesite2SpringbootApplication.class, args);
	}
}
