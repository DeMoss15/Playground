package com.example.playground.di

import com.example.playground.articles.di.articlesDIModule
import com.example.playground.presentation.EditorViewModel
import com.example.playground.user.di.userDIModule
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.startKoin
import org.koin.dsl.module

fun initKoin() {
    startKoin {
        modules(
            appDIModule,
            articlesDIModule,
            userDIModule,
        )
    }
}

val appDIModule = module {

    viewModel { EditorViewModel(get()) }

}
