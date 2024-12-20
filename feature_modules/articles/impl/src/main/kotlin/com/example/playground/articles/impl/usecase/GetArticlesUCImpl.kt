package com.example.playground.articles.impl.usecase

import com.example.playground.articles.api.model.Article
import com.example.playground.articles.api.usecase.GetArticlesUC
import com.example.playground.articles.impl.repository.ArticlesRepo
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flatMapLatest

internal class GetArticlesUCImpl(
//    private val userRepo: UserRepo,
    private val articlesRepo: ArticlesRepo,
): GetArticlesUC {

    override fun executeRx(): Flow<List<Article>> {
        return userRepo.getCurrentUserRx().flatMapLatest { user ->
            articlesRepo.getArticles(user.id)
        }
    }
}