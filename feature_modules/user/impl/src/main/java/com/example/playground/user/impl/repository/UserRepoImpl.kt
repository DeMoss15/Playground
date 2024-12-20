package com.example.playground.user.impl.repository

import com.example.playground.user.api.model.User
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf

class UserRepoImpl: UserRepo {

    override suspend fun getCurrentUser(): User? {
        return null
    }

    override fun getCurrentUserRx(): Flow<User> {
        return flowOf(
            User(id = "testUserId", name = "Test User")
        )
    }

}