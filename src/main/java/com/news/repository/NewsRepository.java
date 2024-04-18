package com.news.repository;

import com.news.model.NewsArticle;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NewsRepository {

    List<NewsArticle> getLatestArticles(int count);
    List<NewsArticle> searchArticles(String title, String author, String keyword);

}
