package com.example.recyclerViewStudy.scene

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerViewStudy.databinding.CharacterItemViewBinding
import com.example.recyclerViewStudy.model.Profile

class CharacterListAdapter : ListAdapter<Profile, CharacterListAdapter.ViewHolder>(CharacterListDiffCallback) {
  inner class ViewHolder(private val binding: CharacterItemViewBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(profile: Profile) {
      binding.apply {
        image.setImageResource(profile.image)
        name.text = profile.name
        favorite.text = profile.favorite
      }
    }
  }

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
    val binding = CharacterItemViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    return ViewHolder(binding)
  }

  override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    holder.bind(getItem(position))
  }

  object CharacterListDiffCallback : DiffUtil.ItemCallback<Profile>() {
    override fun areItemsTheSame(oldItem: Profile, newItem: Profile): Boolean {
      return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: Profile, newItem: Profile): Boolean {
      return oldItem.uuid == newItem.uuid
    }
  }
}