package com.example.domain.usecase

import com.example.domain.module.User
import com.example.domain.repository.UserRepository
import javax.inject.Inject

class DeleteUserUseCase @Inject constructor(
    private val userRepository: UserRepository,
    private val userId: User
) {

    suspend fun execute() = userRepository.delete(userId)


}