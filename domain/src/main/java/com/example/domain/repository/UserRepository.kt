package com.example.domain.repository

//import androidx.lifecycle.LiveData
import com.example.domain.module.User
import io.reactivex.Single

interface UserRepository {

   //fun isValidUser(userName:String , email:String,password:String)

    fun addUser(user: User)

    fun updateUser(user: User)

    fun readAllUser() : Single<List<User>>

    fun delete(userId : User )

    fun deleteAllUser()


}