package com.bcg.life.domain.di.module

import com.bcg.life.domain.model.TestUseCase
import dagger.Module
import dagger.Provides


@Module
class UseCaseModule{

    @Provides
    fun provideTestUseCase() : TestUseCase {
        return TestUseCase()
    }
}