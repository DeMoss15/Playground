package com.example.playground.user.usecase

import com.example.playground.user.model.User
import com.example.playground.user.repository.UserRepo
import kotlinx.coroutines.flow.Flow

internal class GetUserUCImpl(
    private val repo: UserRepo
): GetUserUC {

    override suspend fun execute(): User? {
        return repo.getCurrentUser()
    }

    override fun executeRx(): Flow<User> {
        return repo.getCurrentUserRx()
    }
}