package com.example.playground.articles.impl.repository

import com.example.playground.articles.api.model.Article
import kotlinx.coroutines.flow.Flow

interface ArticlesRepo {

    suspend fun publishArticle(article: Article)
    fun getArticles(userId: String): Flow<List<Article>>

}