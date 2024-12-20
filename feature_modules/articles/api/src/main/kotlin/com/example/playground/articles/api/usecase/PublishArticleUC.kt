package com.example.playground.articles.api.usecase

import com.example.playground.articles.api.model.ArticleContent

interface PublishArticleUC {

    suspend fun execute(content: ArticleContent)

}
