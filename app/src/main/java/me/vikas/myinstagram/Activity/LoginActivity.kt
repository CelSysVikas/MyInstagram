package me.vikas.myinstagram.Activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import me.vikas.myinstagram.R
import me.vikas.myinstagram.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var dataBinding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR

        dataBinding = DataBindingUtil.setContentView(this@LoginActivity, R.layout.activity_login)

        dataBinding.tvSignUp.setOnClickListener {
            startActivity(Intent(this, UserRegisterNavigationActivity::class.java))
        }

        dataBinding.btLogin.setOnClickListener {
            startActivity(Intent(this,NavigateUserActivity::class.java))
        }

    }
}