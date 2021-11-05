package com.example.viewPagerStudy.scene

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.viewPagerStudy.databinding.MainItemViewBinding
import com.example.viewPagerStudy.model.Profile

class MainViewAdapter : ListAdapter<Profile, MainViewAdapter.MainItemViewHolder>(MainListDiffCallback) {
  private lateinit var binding: MainItemViewBinding

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainItemViewHolder {
    binding = MainItemViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    return MainItemViewHolder(binding)
  }

  override fun onBindViewHolder(holder: MainItemViewHolder, position: Int) {
    holder.bind(getItem(position))
  }

  inner class MainItemViewHolder(private val binding: MainItemViewBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(item: Profile) {
      binding.image.setImageResource(item.image)
      binding.name.text = item.name
      binding.favorite.text = item.favorite
    }
  }

  object MainListDiffCallback : DiffUtil.ItemCallback<Profile>() {
    override fun areItemsTheSame(oldItem: Profile, newItem: Profile): Boolean {
      return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: Profile, newItem: Profile): Boolean {
      return oldItem.name == newItem.name
    }
  }
}