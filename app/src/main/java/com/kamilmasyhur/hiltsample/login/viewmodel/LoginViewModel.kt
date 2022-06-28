package com.kamilmasyhur.hiltsample.login.viewmodel

import androidx.lifecycle.ViewModel
import com.kamilmasyhur.hiltsample.login.domain.LoginUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    private val usecase: LoginUseCase
) : ViewModel() {
    fun login(username: String, password: String): Boolean {
        return usecase.login(username, password)
    }
}