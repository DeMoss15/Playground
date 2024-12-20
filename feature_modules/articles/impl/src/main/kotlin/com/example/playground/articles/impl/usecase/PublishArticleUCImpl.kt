package com.example.playground.articles.impl.usecase

import com.example.playground.articles.api.model.Article
import com.example.playground.articles.api.model.ArticleContent
import com.example.playground.articles.api.usecase.PublishArticleUC
import com.example.playground.articles.impl.repository.ArticlesRepo


class PublishArticleUCImpl(
//    private val userRepo: UserRepo,
    private val articlesRepo: ArticlesRepo
): PublishArticleUC {

    override suspend fun execute(content: ArticleContent) {
//        val user = userRepo.getCurrentUser() ?: error("User is not logged in :(")
        val timestamp = System.currentTimeMillis()
        val article = Article(
            author = user,
            timestampMillis = timestamp,
            content = content,
        )
        articlesRepo.publishArticle(article)
    }

}