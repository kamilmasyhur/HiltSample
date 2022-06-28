package com.kamilmasyhur.hiltsample.sample.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.activity.viewModels
import com.kamilmasyhur.hiltsample.R
import com.kamilmasyhur.hiltsample.sample.viewmodel.SampleViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val viewModel: SampleViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val result = viewModel.doSomething()
        findViewById<TextView>(R.id.tvSample).text = result
    }
}