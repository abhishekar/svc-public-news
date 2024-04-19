package com.news.controller;

import com.news.model.ApiResponse;
import com.news.model.NewsArticle;
import com.news.service.NewsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/articles")
public class NewsController {

    private final NewsService newsService;

    public NewsController(NewsService newsService) {
        this.newsService = newsService;
    }

    @GetMapping
    public ResponseEntity<List<NewsArticle>> getLatestArticles(@RequestParam(name = "count", required = false) Integer count) {
        ApiResponse apiResponse = newsService.getLatestArticles(count);
        return ResponseEntity.ok(apiResponse.articles);
    }

    @GetMapping("/search")
    public ResponseEntity<List<NewsArticle>> searchArticles(
            @RequestParam(name = "keyword") String keyword,
            @RequestParam(name = "count", required = false) Integer count) {
        ApiResponse apiResponse = newsService.searchArticles(keyword,count);
        return ResponseEntity.ok(apiResponse.articles);
    }

}
