package com.news.client;


import com.news.model.ApiResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(name = "newsApiClient", url = "${news.api.url}")
public interface NewsApiClient {

    @GetMapping("/top-headlines")
    ApiResponse getTopHeadlines(@RequestParam(name = "q") String keyword,
                                @RequestParam(name = "max") Integer max,
                                @RequestParam(name = "apiKey") String apiKey);

    @GetMapping("/search")
    ApiResponse searchArticles(@RequestParam(name = "q") String keyword,
                               @RequestParam(name = "max") Integer max,
                            @RequestParam(name = "apiKey") String apiKey);

}
