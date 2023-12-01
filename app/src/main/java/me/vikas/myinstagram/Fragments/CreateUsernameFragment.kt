package me.vikas.myinstagram.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import me.vikas.myinstagram.R
import me.vikas.myinstagram.databinding.FragmentCreateUsernameBinding

class CreateUsernameFragment : Fragment() {

    private lateinit var dataBinding:FragmentCreateUsernameBinding
    private lateinit var navController: NavController

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController=Navigation.findNavController(view)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        dataBinding=DataBindingUtil.inflate(inflater,R.layout.fragment_create_username, container, false)

        val bundle = Bundle()

        dataBinding.btNextToPassword.setOnClickListener {
            bundle.putString("username", dataBinding.etUsername.text.toString())
            navController.navigate(R.id.action_createUsernameFragment_to_createPasswordFragment, bundle)
        }



        return dataBinding.root
    }


}