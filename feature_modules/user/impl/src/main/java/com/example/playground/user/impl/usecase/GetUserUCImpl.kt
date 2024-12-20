package com.example.playground.user.impl.usecase

import com.example.playground.user.api.model.User
import com.example.playground.user.api.usecase.GetUserUC
import com.example.playground.user.impl.repository.UserRepo
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