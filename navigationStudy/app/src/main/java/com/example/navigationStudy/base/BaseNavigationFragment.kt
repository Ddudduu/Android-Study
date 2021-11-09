package com.example.navigationStudy.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.IdRes
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController

open class BaseNavigationFragment(@LayoutRes layoutId: Int) : BaseFragment(layoutId) {

  /**
   * 다른 화면으로 이동 (데이터 전달)
   */
  protected fun navigate(@IdRes actionResId: Int, bundle: Bundle? = null) {
    findNavController().navigate(actionResId, bundle)
  }

  /**
   * 다른 화면으로 이동
   */
  protected fun navigate(navDirections: NavDirections) {
    findNavController().navigate(navDirections)
  }
}