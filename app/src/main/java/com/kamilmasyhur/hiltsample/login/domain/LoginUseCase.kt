package com.kamilmasyhur.hiltsample.login.domain

import com.kamilmasyhur.hiltsample.login.data.LoginRepository
import javax.inject.Inject

class LoginUseCase @Inject constructor(
    private val loginUsecase: LoginRepository
) {
    fun login(username: String, password: String): Boolean {
        return loginUsecase.login(username, password)
    }
}