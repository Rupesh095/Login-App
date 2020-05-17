package com.codeprim.loginapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import com.codeprim.loginapp.R

class SignupActivity : AppCompatActivity() {

    private lateinit var usernameTxt : EditText
    private lateinit var emailTxt : EditText
    private lateinit var passwordTxt : EditText
    private lateinit var submitBtn : TextView
    private lateinit var loginProfileTxt : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        viewAction()
    }

    fun viewAction() {
        usernameTxt = findViewById(R.id.usernameTxt)
        emailTxt = findViewById(R.id.emailTxt)
        passwordTxt = findViewById(R.id.passwordTxt)
        submitBtn = findViewById(R.id.submitBtn)
        loginProfileTxt = findViewById(R.id.loginProfileTxt)

        submitBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        loginProfileTxt.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}
