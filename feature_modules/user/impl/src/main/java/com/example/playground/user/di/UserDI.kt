package com.example.playground.user.di

import com.example.playground.user.api.usecase.GetUserUC
import com.example.playground.user.impl.repository.UserRepo
import com.example.playground.user.impl.usecase.GetUserUCImpl
import org.koin.dsl.module

val userDIModule = module {

    factory<GetUserUC> { GetUserUCImpl(get()) }

    factory<UserRepo> {  }

}