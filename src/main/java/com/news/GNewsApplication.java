package com.news;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.news.client")
public class GNewsApplication {

	public static void main(String[] args) {
		SpringApplication.run(GNewsApplication.class, args);
	}

}
