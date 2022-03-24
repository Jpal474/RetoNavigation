package com.example.retonavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.retonavigation.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
private lateinit var binding: FragmentHomeBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val navController=findNavController()
        binding = FragmentHomeBinding.inflate(layoutInflater)
        binding.enviar.setOnClickListener{
           // navController.navigate(R.id.action_homeFragment_to_insideHome)
            val nombre = binding.Name.text.toString()
            val app = binding.App.text.toString()
            val apm = binding.Apm.text.toString()
            val nombreu=binding.NameU.text.toString()
            val correo= binding.mail.text.toString()
            val tel=binding.tel.text.toString()
            val pass=binding.pass.text.toString()

            val destination = HomeFragmentDirections.actionHomeFragmentToInsideHome( nombre, app,apm,nombreu,correo,tel,pass)
            navController.navigate(destination)
        }
        return binding.root
    }
}