package com.example.viewPagerStudy.scene

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.viewPagerStudy.R
import com.example.viewPagerStudy.databinding.MainFragmentBinding
import com.example.viewPagerStudy.model.Profile

class MainFragment : Fragment() {
  private lateinit var binding: MainFragmentBinding
  private lateinit var mainViewAdapter: MainViewAdapter
  private lateinit var profileList: MutableList<Profile>

  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
    binding = MainFragmentBinding.inflate(inflater, container, false)
    return binding.root
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)

    profileList = mutableListOf(
      Profile(R.drawable.chunsik, "춘식이", "고구마"),
      Profile(R.drawable.angmond, "앙몬드", "쪼꼬렛"),
      Profile(R.drawable.scapy, "스카피", "놀기"),
      Profile(R.drawable.muji, "무지", "토끼"),
      Profile(R.drawable.angmond, "앙몬드", "쪼꼬렛"),
      Profile(R.drawable.tube, "튜브", "잠자기")
    )
    mainViewAdapter = MainViewAdapter()
    mainViewAdapter.submitList(profileList)
    binding.viewPager.adapter = mainViewAdapter
  }
}