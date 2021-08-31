package com.example.data.repository.datasource.user

import com.example.data.db.UserDatabase
import com.example.data.entity.UserEntity
import io.reactivex.Single
import javax.inject.Inject

class RemoteUserDatabase @Inject constructor(private val room: UserDatabase) : UserDataSource {


    override fun deleteUserFromDB(userEntity: UserEntity) = room.userDao().deleteUser(userEntity)


    override fun addUserToDB(userEntity: UserEntity) = room.userDao().insertUser(userEntity)


    override fun deleteAllUserFromDB() = room.userDao().deleteAllUser()


//    override fun isValidUser(userName: String, email: String, password: String) =
//        room.userDao().isValidUser(userName, password, email)


    override fun editUser(userEntity: UserEntity) = room.userDao().updateUser(userEntity)


    override fun readAllUserFromDB(): Single<List<UserEntity>> = room.userDao().readAllUser()

}