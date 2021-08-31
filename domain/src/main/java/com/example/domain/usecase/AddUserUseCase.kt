package com.example.domain.usecase

import com.example.domain.module.User
import com.example.domain.repository.UserRepository
import javax.inject.Inject

class AddUserUseCase @Inject constructor(
    private val userRepository: UserRepository,
) {

     fun execute(user: User) = userRepository.addUser(user)
}