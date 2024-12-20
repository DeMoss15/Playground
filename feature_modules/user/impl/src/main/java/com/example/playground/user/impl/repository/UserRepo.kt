package com.example.playground.user.impl.repository

import com.example.playground.user.api.model.User
import kotlinx.coroutines.flow.Flow

interface UserRepo {

    suspend fun getCurrentUser(): User?
    fun getCurrentUserRx(): Flow<User>

}