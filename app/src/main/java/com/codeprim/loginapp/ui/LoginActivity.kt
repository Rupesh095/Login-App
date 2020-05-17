package com.codeprim.loginapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import com.codeprim.loginapp.R

class LoginActivity : AppCompatActivity() {

    private lateinit var usernameTxt : EditText
    private lateinit var passwordTxt : EditText
    private lateinit var loginBtn : TextView
    private lateinit var createProfileTxt : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        viewAction()
    }

    private fun viewAction() {
        usernameTxt = findViewById(R.id.usernameTxt)
        passwordTxt = findViewById(R.id.passwordTxt)
        loginBtn = findViewById(R.id.loginBtn)
        createProfileTxt = findViewById(R.id.createProfileTxt)

        loginBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        createProfileTxt.setOnClickListener {
            val intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
