package com.example.playground.articles.usecase

import com.example.playground.articles.model.Article
import kotlinx.coroutines.flow.Flow

interface GetArticlesUC {

    fun executeRx(): Flow<List<Article>>

}
