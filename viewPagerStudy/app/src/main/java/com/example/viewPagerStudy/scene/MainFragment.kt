package com.example.viewPagerStudy.scene

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.viewPagerStudy.R
import com.example.viewPagerStudy.databinding.MainFragmentBinding
import com.example.viewPagerStudy.model.Profile
import timber.log.Timber

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
      Profile(R.drawable.apeach, "어피치", "복숭아"),
      Profile(R.drawable.tube, "튜브", "잠자기")
    )
    mainViewAdapter = MainViewAdapter()
    mainViewAdapter.submitList(profileList)
    binding.viewPager.adapter = mainViewAdapter
    binding.viewPager.registerOnPageChangeCallback(pageChangeCallback)
  }

  private val pageChangeCallback = object : ViewPager2.OnPageChangeCallback() {
    override fun onPageScrollStateChanged(state: Int) {
      super.onPageScrollStateChanged(state)
      Log.w("$$$0 ", "$state")
    }

    override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
      super.onPageScrolled(position, positionOffset, positionOffsetPixels)
      Log.w("$$$1 ", "$position")
      Log.w("$$$2 ", "$positionOffset")
      Log.w("$$$3 ", "$positionOffsetPixels")
    }

    override fun onPageSelected(position: Int) {
      super.onPageSelected(position)
      Log.w("$$$4 ", "$position")
    }
  }
}