package com.example.playground.user.di

import com.example.playground.user.usecase.GetUserUC
import com.example.playground.user.repository.UserRepo
import com.example.playground.user.repository.UserRepoImpl
import com.example.playground.user.usecase.GetUserUCImpl
import org.koin.dsl.module

val userDIModule = module {

    factory<GetUserUC> { GetUserUCImpl(get()) }

    factory<UserRepo> { UserRepoImpl() }

}