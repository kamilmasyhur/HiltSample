package com.kamilmasyhur.hiltsample

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class FakeService @Inject constructor() {
    fun login(username: String, password: String): Boolean = true
}