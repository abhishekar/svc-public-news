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

    @Cacheable(cacheNames = "latestArticles")
    public ApiResponse getLatestArticles(Integer count) {
        if (count == null) {
            count = 10;
        }
        return newsRepository.getLatestArticles(count);
    }

    @Cacheable(cacheNames = "searchArticles")
    public ApiResponse searchArticles(String keyword, Integer count) {
        if (count == null) {
            count = 10;
        }
        return newsRepository.searchArticles(keyword, count);
    }
}
