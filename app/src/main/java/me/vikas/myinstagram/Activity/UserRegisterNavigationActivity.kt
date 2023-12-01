package me.vikas.myinstagram.Activity

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import me.vikas.myinstagram.R

class UserRegisterNavigationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR

        setContentView(R.layout.activity_user_register_navigation)


    }
}