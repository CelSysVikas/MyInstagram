package me.vikas.myinstagram.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import me.vikas.myinstagram.R
import me.vikas.myinstagram.databinding.FragmentNewUserWelcomeBinding

class NewUserWelcomeFragment : Fragment() {

    private lateinit var dataBinding:FragmentNewUserWelcomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dataBinding=DataBindingUtil.inflate(inflater,R.layout.fragment_new_user_welcome, container, false)
        // Inflate the layout for this fragment

        dataBinding.btCompleteSignUp.setOnClickListener { activity?.finish() }


        return dataBinding.root
    }
}