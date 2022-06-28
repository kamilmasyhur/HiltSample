package com.kamilmasyhur.hiltsample.login.presentation

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.kamilmasyhur.hiltsample.R
import com.kamilmasyhur.hiltsample.home.presentation.HomeActivity
import com.kamilmasyhur.hiltsample.login.viewmodel.LoginViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginActivity : AppCompatActivity() {

    private val viewModel: LoginViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)



        findViewById<Button>(R.id.btnLogin).setOnClickListener {
            val loginStatus = viewModel.login(
                username = findViewById<EditText>(R.id.tvUsername).text.toString(),
                password = findViewById<EditText>(R.id.tvPassword).text.toString()
            )
            if (loginStatus) {

            }
        }
    }
}