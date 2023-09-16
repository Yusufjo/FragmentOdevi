package com.example.fragmentodevi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.fragmentodevi.databinding.FragmentSayfaXBinding
import com.google.android.material.navigation.NavigationBarItemView

class SayfaXFragment : Fragment() {
    private lateinit var binding:FragmentSayfaXBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSayfaXBinding.inflate(inflater, container, false)

        binding.buttonGitXtoY.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.gecisXtoY)
        }
        return binding.root
    }
}