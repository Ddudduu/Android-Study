package com.example.recyclerViewStudy.scene

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerViewStudy.databinding.CharacterItemViewBinding
import com.example.recyclerViewStudy.model.Profile

class CharacterListAdapter(private val dataSet: MutableList<Profile>) : RecyclerView.Adapter<CharacterListAdapter.ViewHolder>() {
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

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterListAdapter.ViewHolder {
    binding = CharacterItemViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    return ViewHolder(binding)
  }

  override fun onBindViewHolder(holder: CharacterListAdapter.ViewHolder, position: Int) {
    holder.bind(dataSet[position])
  }

  override fun getItemCount(): Int {
    return dataSet.size
  }
}