package com.example.playground.user.usecase

import com.example.playground.user.model.User
import kotlinx.coroutines.flow.Flow

interface GetUserUC {

    suspend fun execute(): User?
    fun executeRx(): Flow<User>

}