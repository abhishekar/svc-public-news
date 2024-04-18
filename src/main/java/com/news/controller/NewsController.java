package com.news.controller;

import com.news.model.NewsArticle;
import com.news.service.NewsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/articles")
public class NewsController {

    private final NewsService newsService;

    public NewsController(NewsService newsService) {
        this.newsService = newsService;
    }

    @GetMapping
    public ResponseEntity<List<NewsArticle>> getLatestArticles(@RequestParam(name = "count", required = false) Integer count) {
        List<NewsArticle> articles = newsService.getLatestArticles(count);
        return ResponseEntity.ok(articles);
    }

    @GetMapping("/search")
    public ResponseEntity<List<NewsArticle>> searchArticles(
            @RequestParam(name = "title", required = false) String title,
            @RequestParam(name = "author", required = false) String author,
            @RequestParam(name = "keyword", required = false) String keyword) {
        List<NewsArticle> articles = newsService.searchArticles(title, author, keyword);
        return ResponseEntity.ok(articles);
    }

}
