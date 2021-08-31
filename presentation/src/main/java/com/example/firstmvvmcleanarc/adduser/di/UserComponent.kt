package com.example.firstmvvmcleanarc.adduser.di

import com.example.firstmvvmcleanarc.adduser.view.AddFragment
import dagger.Component


@Component(modules = [UserModule::class])
interface UserComponent {

        fun inject(addFragment: AddFragment)
}