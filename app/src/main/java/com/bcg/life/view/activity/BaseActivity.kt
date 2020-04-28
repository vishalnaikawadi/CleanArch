package com.bcg.life.view.activity

import android.app.ProgressDialog
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.bcg.life.R
import com.bcg.life.view.di.component.DaggerApplicationComponent
import com.bcg.life.view.navigator.CustomActivityNavigator

abstract class BaseActivity<T : ViewDataBinding> : AppCompatActivity() {

    protected val binding: T by lazy { DataBindingUtil.setContentView(this, layoutId) as T }
    abstract val layoutId: Int
    private var progressDialog: ProgressDialog? = null

    lateinit var customActivityNavigator : CustomActivityNavigator

    abstract fun init()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutId)
        customActivityNavigator = DaggerApplicationComponent.builder().build().getCustomActivityNavigator()
        init()
    }

    fun initLoader(message: String, title: String, isCancelable: Boolean) {
        if (progressDialog == null) {
            progressDialog = ProgressDialog(this)
        }

        progressDialog?.apply {
            if (!isShowing) {
                setMessage(message)
                setCancelable(isCancelable)
                setTitle(title)
                show()
            }
        }
    }

    fun finishLoader() {
        progressDialog?.apply {
            if(isShowing){
                dismiss()
                progressDialog = null
            }
        }
    }

    fun showToast(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show()
    }

    fun replaceFragment(containerId: Int, fragment: androidx.fragment.app.Fragment, bundle: Bundle?) {
        if (bundle != null) {
            fragment.arguments = bundle
        }
        supportFragmentManager.beginTransaction().replace(containerId, fragment).commitAllowingStateLoss()
    }

    fun addFragment(containerId: Int, fragment: androidx.fragment.app.Fragment, bundle: Bundle?, transition : Boolean = false) {
        if (bundle != null) {
            fragment.arguments = bundle
        }
        if(!transition)
            supportFragmentManager.beginTransaction().setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left, R.anim.enter_from_left, R.anim.exit_to_right).add(containerId, fragment).addToBackStack(null).commitAllowingStateLoss()
        else
            supportFragmentManager.beginTransaction().setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left, R.anim.enter_from_left, R.anim.exit_to_right).add(containerId, fragment).addToBackStack(null).commitAllowingStateLoss()
    }
}
