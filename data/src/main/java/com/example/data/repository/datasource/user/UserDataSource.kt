package com.example.data.repository.datasource.user

import com.example.data.entity.UserEntity
import io.reactivex.Single

interface UserDataSource {


     fun deleteUserFromDB(userEntity: UserEntity)

     fun addUserToDB(userEntity: UserEntity)

     fun deleteAllUserFromDB()

    //fun isValidUser(userName:String , email:String,password:String)

     fun editUser(userEntity: UserEntity)

     fun readAllUserFromDB() : Single<List<UserEntity>>

}