package com.example.playground.articles.impl.repository

import com.example.playground.articles.api.model.Article
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class ArticlesRepoImpl: ArticlesRepo {

    private val articlesFlow = MutableStateFlow<List<Article>>(emptyList())

    override suspend fun publishArticle(article: Article) {
        articlesFlow.value
            .toMutableList()
            .let {
                it.add(article)
                articlesFlow.emit(it)
            }
    }

    override fun getArticles(userId: String): Flow<List<Article>> {
        return articlesFlow.asStateFlow()
    }
}