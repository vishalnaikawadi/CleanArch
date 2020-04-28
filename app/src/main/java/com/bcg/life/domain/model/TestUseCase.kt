package com.bcg.life.domain.model

import com.bcg.life.domain.usecase.BaseUseCase

class TestUseCase : BaseUseCase() {


    fun testMethod() {
       // apiHelper.testMethod()
        localDatabaseHelper.testMethod()
    }
}