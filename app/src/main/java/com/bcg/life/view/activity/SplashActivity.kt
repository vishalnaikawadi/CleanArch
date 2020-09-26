package com.bcg.life.view.activity

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import com.bcg.life.R
import com.bcg.life.databinding.ActivitySplashBinding
import com.bcg.life.view.viewmodel.SplashViewModel

class SplashActivity : BaseActivity<ActivitySplashBinding>() {

    override val layoutId: Int get() = R.layout.activity_splash

    lateinit var splashViewModel: SplashViewModel

    //This is the only change

    override fun init() {
        splashViewModel = ViewModelProvider(this).get(SplashViewModel::class.java)
        splashViewModel.testMethod()
    }
}
