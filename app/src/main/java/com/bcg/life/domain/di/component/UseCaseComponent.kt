package com.bcg.life.domain.di.component

import com.bcg.life.domain.di.module.UseCaseModule
import com.bcg.life.domain.model.TestUseCase
import dagger.Component

@Component(modules = [UseCaseModule::class])
interface UseCaseComponent {

    fun getTestUseCase() : TestUseCase

}