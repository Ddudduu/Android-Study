package com.example.navigationStudy.scene

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navigationStudy.R
import com.example.navigationStudy.base.BaseNavigationFragment
import com.example.navigationStudy.databinding.MainFragmentBinding

class MainFragment : BaseNavigationFragment(R.layout.main_fragment) {
  private lateinit var binding: MainFragmentBinding

  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
    binding = MainFragmentBinding.inflate(inflater, container, false)
    return binding.root
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    binding.image.setOnClickListener {
      showDialog("캐릭터 정보", "춘식이")
    }
  }
}