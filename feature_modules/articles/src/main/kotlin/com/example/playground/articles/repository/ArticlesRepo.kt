package com.example.playground.articles.repository

import com.example.playground.articles.model.Article
import kotlinx.coroutines.flow.Flow

interface ArticlesRepo {

    suspend fun publishArticle(article: Article)
    fun getArticles(userId: String): Flow<List<Article>>

}