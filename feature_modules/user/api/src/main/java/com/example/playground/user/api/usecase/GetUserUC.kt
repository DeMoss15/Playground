package com.example.playground.user.api.usecase

import com.example.playground.user.api.model.User
import kotlinx.coroutines.flow.Flow

interface GetUserUC {

    suspend fun execute(): User?
    fun executeRx(): Flow<User>

}