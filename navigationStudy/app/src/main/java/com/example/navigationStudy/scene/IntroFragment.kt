package com.example.navigationStudy.scene

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavDirections
import com.example.navigationStudy.R
import com.example.navigationStudy.base.BaseNavigationFragment
import com.example.navigationStudy.databinding.IntroFragmentBinding

class IntroFragment : BaseNavigationFragment(R.layout.intro_fragment) {
  private lateinit var binding: IntroFragmentBinding

  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
    binding = IntroFragmentBinding.inflate(inflater, container, false)
    return binding.root
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    val action: NavDirections = IntroFragmentDirections.actionIntroFragmentToMainFragment()
    binding.root.setOnClickListener {
      //view.findNavController().navigate(action)
      showDialog("화면 전환", "확인을 누르면 화면이 넘어갑니다.") { navigate(R.id.action_introFragment_to_mainFragment) }
    }
  }
}