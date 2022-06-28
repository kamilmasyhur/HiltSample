package com.kamilmasyhur.hiltsample

import javax.inject.Inject

class FakeService @Inject constructor() {
    fun login(username: String, password: String): Boolean = true
}