package com.ibrahimkuley.dao;

import com.ibrahimkuley.entity.Article;

import java.util.List;

/**
 * Created by hikuley on 20.10.2014.
 */
public interface ArticleDAO {

    public void addArticle(Article article);

    public void updateArtcile(Article article);

    public List<Article> articleList();

    public void deleteArticle(Article article);

    public Article getAtricleById(int id);
}
