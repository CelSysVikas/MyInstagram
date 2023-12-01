package me.vikas.myinstagram.Activity

import android.app.Activity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import me.vikas.myinstagram.R
import me.vikas.myinstagram.databinding.ActivityNavigateUserBinding

class NavigateUserActivity : AppCompatActivity() {

    private lateinit var dataBinding:ActivityNavigateUserBinding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR

        dataBinding=DataBindingUtil.setContentView(this,R.layout.activity_navigate_user)


        val navHostFragment=supportFragmentManager.findFragmentById(dataBinding.userNavigation.id) as NavHostFragment
        navController=navHostFragment.navController

//        setupWithNavController(dataBinding.btNav,navController)
        dataBinding.btNav.setupWithNavController(navController)

        /*dataBinding.btNav.setOnItemSelectedListener {
            when(it.itemId){
                R.id.reelsFragment->changeAppTheme(this,true)

                else->changeAppTheme(this,false)
            }
            true
        }*/

    }

    fun changeAppTheme(activity: Activity, isDark: Boolean) {
        if (isDark) {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        } else {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        }
    }
}