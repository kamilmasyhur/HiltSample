package com.kamilmasyhur.hiltsample.login.di

import com.kamilmasyhur.hiltsample.login.data.LoginRepository
import com.kamilmasyhur.hiltsample.login.data.LoginRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent

@Module
@InstallIn(ActivityRetainedComponent::class)
interface LoginModule {
    @Binds
    fun bindRepository(impl: LoginRepositoryImpl): LoginRepository
}