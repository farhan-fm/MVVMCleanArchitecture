package com.example.domain.usecase

import com.example.domain.repository.UserRepository
import javax.inject.Inject

class DeleteAllUserUseCase @Inject constructor(private val userRepository: UserRepository){

    suspend fun execute() = userRepository.deleteAllUser()
}