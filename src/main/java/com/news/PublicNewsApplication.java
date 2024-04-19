package com.news;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.news.client")
public class PublicNewsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PublicNewsApplication.class, args);
	}

}
