package com.example.data.db

import androidx.room.*
import com.example.data.entity.UserEntity
import io.reactivex.Single

@Dao
interface UserDao {

    @Insert(onConflict = OnConflictStrategy.ABORT)
     fun insertUser(userEntity: UserEntity)

    @Update
     fun updateUser(userEntity: UserEntity)

    @Delete
     fun deleteUser(userEntity: UserEntity)

    @Query("SELECT * FROM user_tb")
    fun readAllUser() : Single<List<UserEntity>>

    @Query("Delete FROM user_tb")
     fun deleteAllUser()

//    @Query("SELECT * FROM user_tb WHERE userName==:userName AND password ==:password AND email==:email")
//    fun isValidUser(userName: String, password: String, email: String)

}