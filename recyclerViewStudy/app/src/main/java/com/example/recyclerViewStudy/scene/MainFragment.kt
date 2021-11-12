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

  private lateinit var characterRecyclerViewAdapter: CharacterRecyclerViewAdapter
  private lateinit var characterListAdapter: CharacterListAdapter
  private lateinit var dataSet: MutableList<Profile>
  private lateinit var dataSet2: MutableList<Profile>

  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
    binding = MainFragmentBinding.inflate(inflater, container, false)
    return binding.root
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    setData()

//    // RecyclerView.Adapter 활용
//    characterRecyclerViewAdapter = CharacterRecyclerViewAdapter(dataSet = dataSet)
//    binding.recyclerView.adapter = characterRecyclerViewAdapter
//    binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())
//
//    // 클릭 시 데이터 변경
//    binding.title.setOnClickListener {
//      dataSet.clear()
//      dataSet.addAll(dataSet2)
//      //characterRecyclerViewAdapter.notifyItemRangeChanged(0,5)
//      characterRecyclerViewAdapter.notifyDataSetChanged()
//    }


    // ListAdapter 활용
    characterListAdapter = CharacterListAdapter().apply {
      submitList(dataSet)
    }
    binding.recyclerView.adapter = characterListAdapter
    binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())

    binding.title.setOnClickListener {
      characterListAdapter.submitList(dataSet2)
    }

  }

  private fun setData() {
    dataSet = mutableListOf(
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

    dataSet2 = mutableListOf(
      Profile(R.drawable.chunsik, "춘식이", "고구마"),
      Profile(R.drawable.scapy, "스카피", "요리"),
      Profile(R.drawable.muji, "무지", "토끼"),
      Profile(R.drawable.angmond, "앙몬드", "초콜릿"),
      Profile(R.drawable.apeach, "어피치", "복숭아"),
    )
  }
}