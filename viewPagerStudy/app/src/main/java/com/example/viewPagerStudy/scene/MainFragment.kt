package com.example.viewPagerStudy.scene

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.viewPagerStudy.databinding.MainFragmentBinding

class MainFragment : Fragment() {
  private lateinit var binding: MainFragmentBinding

  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
    binding = MainFragmentBinding.inflate(inflater, container, false)
    return binding.root
  }
}