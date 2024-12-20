package com.example.playground.articles.di

import com.example.playground.articles.repository.ArticlesRepo
import com.example.playground.articles.repository.ArticlesRepoImpl
import com.example.playground.articles.usecase.GetArticlesUC
import com.example.playground.articles.usecase.PublishArticleUC
import com.example.playground.articles.usecase.GetArticlesUCImpl
import com.example.playground.articles.usecase.PublishArticleUCImpl
import org.koin.dsl.module

val articlesDIModule = module {

    factory<GetArticlesUC> { GetArticlesUCImpl(get()) }
    factory<PublishArticleUC> { PublishArticleUCImpl(get()) }

    factory<ArticlesRepo> { ArticlesRepoImpl() }

}