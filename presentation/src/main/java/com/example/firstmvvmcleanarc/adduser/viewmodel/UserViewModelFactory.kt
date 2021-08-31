package com.example.firstmvvmcleanarc.adduser.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.domain.usecase.*
import com.example.firstmvvmcleanarc.adduser.module.UserModuleDataMapper

class UserViewModelFactory constructor(
     val addUserUseCase: AddUserUseCase,
     val editUserUseCase: UpdateUserUseCase,
     val usersUseCase: GetUserUseCase,
     val removeAllUseCase : DeleteAllUserUseCase,
     val removeUserUseCase: DeleteUserUseCase,
     val userModelDataMapper: UserModuleDataMapper
): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(UserViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return UserViewModel(
                addUserUseCase,
                removeAllUseCase,
                removeUserUseCase,
                usersUseCase,
                editUserUseCase,
                userModelDataMapper
            ) as T
        }else {
            throw IllegalArgumentException("Unknown ViewModel class")
        }

    }
}