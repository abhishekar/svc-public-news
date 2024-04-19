package com.news.repository;

import com.news.model.ApiResponse;
import org.springframework.stereotype.Repository;


@Repository
public interface NewsRepository {

    ApiResponse getLatestArticles(Integer count);
    ApiResponse searchArticles(String keyword, Integer count);

}
