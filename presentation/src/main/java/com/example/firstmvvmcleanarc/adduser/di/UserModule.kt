package com.example.firstmvvmcleanarc.adduser.di

import com.example.data.mapper.UserEntityDataMapper
import com.example.data.repository.datasource.user.UserDataSourceFactory
import com.example.data.repository.impl.UserRepositoryImpl
import com.example.domain.repository.UserRepository
import com.example.domain.usecase.*
import com.example.firstmvvmcleanarc.adduser.module.UserModuleDataMapper
import com.example.firstmvvmcleanarc.adduser.viewmodel.UserViewModelFactory
import dagger.Module
import dagger.Provides


@Module
class UserModule {

    @Provides
    fun providesUserViewModelFactory(
        addUserUseCase: AddUserUseCase,
        editUserUseCase: UpdateUserUseCase,
        usersUseCase: GetUserUseCase,
        removeAllUseCase: DeleteAllUserUseCase,
        removeUserUseCase: DeleteUserUseCase,
        userModelDataMapper: UserModuleDataMapper
    )= UserViewModelFactory (
        addUserUseCase,
        editUserUseCase,
        usersUseCase,
        removeAllUseCase,
        removeUserUseCase,
        userModelDataMapper
            )

    @Provides
    fun providesUserRepository(
       userDataSourceFactory: UserDataSourceFactory,
       userEntityDataMapper: UserEntityDataMapper
    ):UserRepository = UserRepositoryImpl(
        userDataSourceFactory,userEntityDataMapper
    )

}