package com.example.navigationStudy.scene

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavDirections
import androidx.navigation.findNavController
import com.example.navigationStudy.databinding.IntroFragmentBinding

class IntroFragment : Fragment() {
  private lateinit var binding: IntroFragmentBinding

  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
    binding = IntroFragmentBinding.inflate(inflater, container, false)
    return binding.root
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    val action: NavDirections = IntroFragmentDirections.actionIntroFragmentToMainFragment()
    binding.root.setOnClickListener {
      view.findNavController().navigate(action)
    }
  }
}