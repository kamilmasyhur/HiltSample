package com.kamilmasyhur.hiltsample.sample.viewmodel

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SampleViewModel @Inject constructor(): ViewModel() {
    fun doSomething(): String {
        return doSomethingPrivately()
    }


    private fun doSomethingPrivately(): String {
        return "Hello World"
    }
}