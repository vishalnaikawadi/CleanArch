package com.bcg.life.view.viewmodel

import com.bcg.life.domain.di.component.DaggerUseCaseComponent

class SplashViewModel : BaseViewModel() {


    private var testUseCase = DaggerUseCaseComponent.builder().build().getTestUseCase()

    fun testMethod() {
        testUseCase.testMethod()
    }

}