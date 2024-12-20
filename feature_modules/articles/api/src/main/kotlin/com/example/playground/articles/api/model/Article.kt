package com.example.playground.articles.api.model

import com.example.playground.user.api.model.User

class Article(
    val author: User,
    val timestampMillis: Long,
    val content: ArticleContent,
)