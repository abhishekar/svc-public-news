package com.news.repository;

import com.news.client.NewsApiClient;
import com.news.model.ApiResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class NewsRepositoryImpl implements NewsRepository {

    private final NewsApiClient newsApiClient;

    @Value("${news.api.key}")
    private String newsApiKey;

    public NewsRepositoryImpl(NewsApiClient newsApiClient) {
        this.newsApiClient = newsApiClient;
    }

    @Override
    public ApiResponse getLatestArticles(Integer max) {
        return newsApiClient.getTopHeadlines(null,max,newsApiKey);
    }

    @Override
    public ApiResponse searchArticles(String keyword, Integer max) {
        return newsApiClient.searchArticles(keyword,max,newsApiKey);
    }
}
