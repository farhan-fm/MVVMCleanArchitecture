package com.example.firstmvvmcleanarc.adduser.module

import com.example.domain.module.User
import java.util.*
import javax.inject.Inject

class UserModuleDataMapper @Inject constructor() {

    fun transformUsersToUserModels(users: List<User>?): List<UserModule> {
        val list = ArrayList<UserModule>()
        users?.forEach {
            transformUserToUserModel(it)?.let { it1 -> list.add(it1) }
        }
        return list
    }

    private fun transformUserToUserModel(user: User) : UserModule = user?.let  {
        UserModule(
            it.id,
            it.fName,
            it.lName,
            it.userName,
            it.password,
            it.email
        )
    }
    fun transformUserModelToUser(user: UserModule): User = with(user) {
        User(
            id,
            fName,
            lName,
            userName,
            password,
            email
        )
    }


}