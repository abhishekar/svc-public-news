package com.news.client;


import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "newsApi", url = "${news.api.url}")
public class NewsApiClient {
}
