package me.vikas.myinstagram.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import me.vikas.myinstagram.Adapter.TabLayoutAdapter
import me.vikas.myinstagram.R
import me.vikas.myinstagram.databinding.FragmentUserProfileBinding


class UserProfileFragment : Fragment() {

    private lateinit var dataBinding:FragmentUserProfileBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dataBinding=DataBindingUtil.inflate(inflater,R.layout.fragment_user_profile, container, false)


        dataBinding.vpUser.adapter=
            activity?.let { TabLayoutAdapter(it.supportFragmentManager,lifecycle) }

        val ICONS = intArrayOf(
            R.drawable.ic_grid,
            R.drawable.ic_reel,
            R.drawable.user
        )


        TabLayoutMediator(dataBinding.userTabs,dataBinding.vpUser){tab,position->
            when(position){
                0->{
                    tab.setIcon(R.drawable.ic_grid)
                }
                1->{
                    tab.setIcon(R.drawable.ic_reel)
                }
                2->{
                    tab.setIcon(R.drawable.ic_new_user)
                }
            }
        }.attach()

        return dataBinding.root
    }

}