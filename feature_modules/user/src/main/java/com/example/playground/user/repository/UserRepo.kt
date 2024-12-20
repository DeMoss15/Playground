package com.example.playground.user.repository

import com.example.playground.user.model.User
import kotlinx.coroutines.flow.Flow

interface UserRepo {

    suspend fun getCurrentUser(): User?
    fun getCurrentUserRx(): Flow<User>

}