package com.example.playground.articles.api.usecase

import com.example.playground.articles.api.model.Article
import kotlinx.coroutines.flow.Flow

interface GetArticlesUC {

    fun executeRx(): Flow<List<Article>>

}
