package com.bcg.life.view.fragment


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import com.bcg.life.view.activity.BaseActivity
import com.bcg.life.view.di.component.DaggerApplicationComponent
import com.bcg.life.view.navigator.CustomActivityNavigator

abstract class BaseFragment<T : ViewDataBinding> : Fragment() {

    abstract val layoutId: Int
    protected lateinit var binding: T

    lateinit var customActivityNavigator: CustomActivityNavigator

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, layoutId, container, false)
        customActivityNavigator = DaggerApplicationComponent.builder().build().getCustomActivityNavigator()
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }

    abstract fun init()

    fun initLoader(message: String, title: String, isCancelable: Boolean) {
        getBaseActivity().initLoader(message, title, isCancelable)
    }

    fun finishLoader() {
        getBaseActivity().finishLoader()
    }

    fun showToast(message: String) {
        getBaseActivity().showToast(message)
    }

    protected fun getBaseActivity(): BaseActivity<*> {
        return (activity as BaseActivity<*>)
    }
}
