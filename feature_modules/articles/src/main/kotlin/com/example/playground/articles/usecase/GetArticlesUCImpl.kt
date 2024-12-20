package com.example.playground.articles.usecase

import com.example.playground.articles.model.Article
import com.example.playground.articles.repository.ArticlesRepo
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flatMapLatest
import kotlinx.coroutines.flow.flowOf

internal class GetArticlesUCImpl(
//    private val userRepo: UserRepo,
    private val articlesRepo: ArticlesRepo,
): GetArticlesUC {

    override fun executeRx(): Flow<List<Article>> {
        return flowOf(emptyList())
//        return userRepo.getCurrentUserRx().flatMapLatest { user ->
//            articlesRepo.getArticles(user.id)
//        }
    }
}