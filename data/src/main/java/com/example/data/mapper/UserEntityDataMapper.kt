package com.example.data.mapper


import com.example.data.entity.UserEntity
import com.example.domain.module.User
import javax.inject.Inject

class UserEntityDataMapper @Inject constructor() {

    fun transferUserEntitysToUsers(userEntity: List<UserEntity>): List<User> {
        val users = arrayListOf<User>()

        if (userEntity.isNotEmpty()) {
            for (userEntity in userEntity) {
                transferUserEntityToUser(userEntity)?.let { users.add(it) }
            }
        }
        return users
    }

    fun transferUserEntityToUser(userEntity: UserEntity): User? =
        userEntity.let {
            User(
                it.id,
                it.fName,
                it.fName,
                it.userName,
                it.password,
                it.email
            )
        }

    fun transformUserToUserEntity(user: User): UserEntity = with(user) {
        UserEntity(
            id,
            fName,
            lName,
            userName,
            password,
            email
        )
    }


}