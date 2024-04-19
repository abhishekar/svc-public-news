package com.news.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiResponse {

    @JsonProperty("totalArticles")
    public int totalArticles;
    @JsonProperty("articles")
    public List<NewsArticle> articles;
}
