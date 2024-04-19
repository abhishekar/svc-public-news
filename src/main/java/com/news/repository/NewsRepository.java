package com.news.repository;

import com.news.model.ApiResponse;
import org.springframework.stereotype.Repository;


@Repository
public interface NewsRepository {

    ApiResponse getLatestArticles(int count);
    ApiResponse searchArticles(String title, String author, String keyword);

}
