package com.kamilmasyhur.hiltsample.login.data

import com.kamilmasyhur.hiltsample.FakeService
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

interface LoginRepository {
    fun login(username: String, password: String): Boolean
}

class LoginRepositoryImpl @Inject constructor(
    private val service: FakeService
) : LoginRepository {
    override fun login(username: String, password: String): Boolean {
        return service.login(username, password)
    }
}