package com.example.recyclerViewStudy.scene

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerViewStudy.databinding.CharacterItemViewBinding
import com.example.recyclerViewStudy.model.Profile

class CharacterRecyclerViewAdapter(private val dataSet: MutableList<Profile>) : RecyclerView.Adapter<CharacterRecyclerViewAdapter.ViewHolder>() {
  private lateinit var binding: CharacterItemViewBinding

  inner class ViewHolder(private val binding: CharacterItemViewBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(profile: Profile) {
      binding.apply {
        image.setImageResource(profile.image)
        name.text = profile.name
        favorite.text = profile.favorite
      }
    }
  }

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterRecyclerViewAdapter.ViewHolder {
    binding = CharacterItemViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    return ViewHolder(binding)
  }

  override fun onBindViewHolder(holder: CharacterRecyclerViewAdapter.ViewHolder, position: Int) {
    holder.bind(dataSet[position])
  }

  override fun getItemCount(): Int {
    return dataSet.size
  }
}