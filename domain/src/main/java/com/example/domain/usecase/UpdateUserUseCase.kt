package com.example.domain.usecase

import com.example.domain.module.User
import com.example.domain.repository.UserRepository
import javax.inject.Inject

class UpdateUserUseCase @Inject constructor(
    private val user: User,
    private val userRepository: UserRepository
) {

    suspend fun execute(): Unit = userRepository.updateUser(user)

}