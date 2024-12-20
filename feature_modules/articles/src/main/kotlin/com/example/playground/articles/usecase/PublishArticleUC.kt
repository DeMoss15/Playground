package com.example.playground.articles.usecase

import com.example.playground.articles.model.ArticleContent

interface PublishArticleUC {

    suspend fun execute(content: ArticleContent)

}
