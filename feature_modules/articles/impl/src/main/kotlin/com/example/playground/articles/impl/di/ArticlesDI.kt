package com.example.playground.articles.impl.di

import com.example.playground.articles.api.usecase.GetArticlesUC
import com.example.playground.articles.api.usecase.PublishArticleUC
import com.example.playground.articles.impl.usecase.GetArticlesUCImpl
import com.example.playground.articles.impl.usecase.PublishArticleUCImpl
import org.koin.dsl.module

val articlesDIModule = module {

    factory<GetArticlesUC> { GetArticlesUCImpl(get()) }
    factory<PublishArticleUC> { PublishArticleUCImpl(get()) }

    factory { Articles }

}