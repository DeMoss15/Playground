package com.example.playground.articles.usecase

import com.example.playground.articles.model.Article
import com.example.playground.articles.model.ArticleContent
import com.example.playground.articles.repository.ArticlesRepo


class PublishArticleUCImpl(
//    private val userRepo: UserRepo,
    private val articlesRepo: ArticlesRepo
): PublishArticleUC {

    override suspend fun execute(content: ArticleContent) {
//        val user = userRepo.getCurrentUser() ?: error("User is not logged in :(")
        val timestamp = System.currentTimeMillis()
        val article = Article(
//            author = user,
            timestampMillis = timestamp,
            content = content,
        )
        articlesRepo.publishArticle(article)
    }

}