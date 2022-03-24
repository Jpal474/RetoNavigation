package com.example.retonavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.retonavigation.databinding.FragmentInsideHomeBinding


class insideHome : Fragment() {
    private lateinit var binding: FragmentInsideHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentInsideHomeBinding.inflate(layoutInflater)
        val nombre = arguments?.getString("Nombre")
        val app = arguments?.getString("ApellidoP")
        val apm = arguments?.getString("ApellidoM")
        val nombreu = arguments?.getString("NombreU")
        val mail = arguments?.getString("Correo")
        val tel = arguments?.getString("NumeroTel")
        val pass = arguments?.getString("Contraseña")
        binding.textView2.setText(nombre)
        binding.textView3.setText(app)
        binding.textView4.setText(apm)
        binding.textView5.setText(nombreu)
        binding.textView6.setText(mail)
        binding.textView7.setText(tel)
        binding.textView8.setText(pass)
        return binding.root
    }
}