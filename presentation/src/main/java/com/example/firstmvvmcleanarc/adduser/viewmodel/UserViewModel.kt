package com.example.firstmvvmcleanarc.adduser.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.domain.usecase.*
import com.example.firstmvvmcleanarc.adduser.module.UserModule
import com.example.firstmvvmcleanarc.adduser.module.UserModuleDataMapper
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class UserViewModel(
    private val addUserUseCase: AddUserUseCase,
    private val deleteAllUserUseCase: DeleteAllUserUseCase,
    private val deleteUserUseCase: DeleteUserUseCase,
    private val getUserUseCase: GetUserUseCase,
    private val updateUserUseCase: UpdateUserUseCase,
    private val userModuleDataMapper: UserModuleDataMapper
) : ViewModel() {

//    val addCustomerLiveData = MutableLiveData<Result>()
//    val editCustomerLiveData = MutableLiveData<Result>()
//    val getCustomerLiveData = MutableLiveData<Result>()
//    val removeCustomerLiveData = MutableLiveData<Result>()

    fun addUser(userModule: UserModule) {

        viewModelScope.launch(Dispatchers.IO) {

            addUserUseCase.execute(userModuleDataMapper.transformUserModelToUser(userModule))
        }
    }

    fun editUser(userModule: UserModule) {
        viewModelScope.launch(Dispatchers.IO) {

        }
    }

    fun deleteUser(userModule: UserModule) {

        viewModelScope.launch(Dispatchers.IO) {

        }

    }

    fun getUser() {

    }

    fun deleteAllUser() {
        viewModelScope.launch(Dispatchers.IO) {

        }
    }

}