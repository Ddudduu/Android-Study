package com.example.recyclerViewStudy.scene

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerViewStudy.R
import com.example.recyclerViewStudy.base.BaseNavigationFragment
import com.example.recyclerViewStudy.databinding.MainFragmentBinding
import com.example.recyclerViewStudy.model.Profile

class MainFragment : BaseNavigationFragment(R.layout.main_fragment) {
  private lateinit var binding: MainFragmentBinding
  private lateinit var characterListAdapter: CharacterListAdapter

  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
    binding = MainFragmentBinding.inflate(inflater, container, false)
    return binding.root
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
//    binding.title.setOnClickListener {
//      showDialog("캐릭터 정보", "확인을 누르면 캐릭터 정보가 나타납니다.") { binding.recyclerView.visibility = View.VISIBLE }
//    }

    val dataSet = mutableListOf(
      Profile(R.drawable.angmond, "앙몬드", "초콜릿"),
      Profile(R.drawable.apeach, "어피치", "복숭아"),
      Profile(R.drawable.chunsik, "춘식이", "고구마"),
      Profile(R.drawable.muji, "무지", "토끼"),
      Profile(R.drawable.scapy, "스카피", "요리"),
      Profile(R.drawable.tube, "튜브", "오리"),
      Profile(R.drawable.jordi, "조르디", "공룡"),
      Profile(R.drawable.lion, "라이언", "춘시기"),
      Profile(R.drawable.neo, "네오", "거울보기"),
      Profile(R.drawable.panda, "팬다주니어", "놀기"),
    )
    characterListAdapter = CharacterListAdapter(dataSet = dataSet)
    binding.recyclerView.adapter = characterListAdapter
    binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())
  }
}