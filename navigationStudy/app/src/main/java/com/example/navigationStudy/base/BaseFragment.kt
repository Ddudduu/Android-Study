package com.example.navigationStudy.base

import android.app.AlertDialog
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import com.example.navigationStudy.databinding.CustomDialogViewBinding

open class BaseFragment(@LayoutRes layoutId: Int) : Fragment(layoutId) {
  fun showDialog(titleText: String, contentText: String, okClickListener: (() -> Unit)? = null) {
    AlertDialog.Builder(requireActivity()).create().apply {
      val binding = CustomDialogViewBinding.inflate(layoutInflater, null, false).apply {
        titleLabel.text = titleText
        contentLabel.text = contentText

        okButton.setOnClickListener {
          dismiss()
          okClickListener?.invoke()
        }
        cancleButton.setOnClickListener {
          dismiss()
        }
      }
      setView(binding.root)
    }.show()
  }
}