package me.vikas.myinstagram.Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import me.vikas.myinstagram.Fragments.UserPostFragment
import me.vikas.myinstagram.Fragments.UserReelsFragment
import me.vikas.myinstagram.Fragments.UserTagFragment

class TabLayoutAdapter(fm:FragmentManager, lifecycle: Lifecycle):FragmentStateAdapter(fm, lifecycle) {
    override fun getItemCount(): Int =3

    override fun createFragment(position: Int): Fragment {
       return when(position){
            0->UserPostFragment()
            1->UserReelsFragment()
            2->UserTagFragment()
            else->{
                Fragment()
            }
        }
    }

}