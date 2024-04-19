package com.news.service;

import com.news.model.ApiResponse;
import com.news.model.NewsArticle;
import com.news.repository.NewsRepository;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsService {

    private final NewsRepository newsRepository;

    public NewsService(NewsRepository newsRepository) {
        this.newsRepository = newsRepository;
    }

    @Cacheable(cacheNames = "latestArticles", unless = "#count == null")
    public ApiResponse getLatestArticles(Integer count) {
        if (count == null) {
            count = 10; // Set a default value if count is not provided
        }
        return newsRepository.getLatestArticles(count);
    }

    @Cacheable(cacheNames = "searchArticles", unless = "#title == null && #author == null && #keyword == null")
    public ApiResponse searchArticles(String title, String author, String keyword) {
        return newsRepository.searchArticles(title, author, keyword);
    }
}
