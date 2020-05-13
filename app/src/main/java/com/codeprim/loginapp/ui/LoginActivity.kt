package com.codeprim.loginapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import com.codeprim.loginapp.R

class LoginActivity : AppCompatActivity() {

    private lateinit var usernameTxt : EditText
    private lateinit var emailTxt : EditText
    private lateinit var passwordTxt : EditText
    private lateinit var submitBtn : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

    }
}
