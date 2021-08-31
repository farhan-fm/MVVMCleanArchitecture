package com.example.domain.usecase

import com.example.domain.module.User
import com.example.domain.repository.UserRepository
import io.reactivex.Single
import javax.inject.Inject

class GetUserUseCase @Inject constructor(private val userRepository: UserRepository) {

    suspend fun execute(): Single<List<User>>? = userRepository.readAllUser()
}