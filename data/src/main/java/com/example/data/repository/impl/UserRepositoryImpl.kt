package com.example.data.repository.impl

import com.example.data.mapper.UserEntityDataMapper
import com.example.data.repository.datasource.user.UserDataSourceFactory
import com.example.domain.module.User
import com.example.domain.repository.UserRepository
import io.reactivex.Single

class UserRepositoryImpl(
    private val userDataSourceFactory: UserDataSourceFactory,
    private val userEntityDataMapper: UserEntityDataMapper
) : UserRepository {
//    override fun isValidUser(userName: String, email: String, password: String) {
//        TODO("Not yet implemented")
//    }


//    override fun isValidUser(userName: String, email: String, password: String) {
//        //  userDataSourceFactory.create().isValidUser(userName, email, password)
//    }

    override fun addUser(user: User) = userDataSourceFactory.create()
        .addUserToDB(userEntityDataMapper.transformUserToUserEntity(user))


    override fun updateUser(user: User) = userDataSourceFactory.create()
        .editUser(userEntityDataMapper.transformUserToUserEntity(user))


    override fun readAllUser(): Single<List<User>> =
        userDataSourceFactory.create().readAllUserFromDB()
            ?.map(userEntityDataMapper::transferUserEntitysToUsers)


    override fun delete(userId: User) =
        userDataSourceFactory.create()
            .deleteUserFromDB(userEntityDataMapper.transformUserToUserEntity(userId))

    override fun deleteAllUser() =
        userDataSourceFactory.create().deleteAllUserFromDB()

}