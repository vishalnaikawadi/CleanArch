package com.bcg.life.view.di.module

import android.content.Context
import dagger.Module
import dagger.Provides

@Module
class ContextModule(private val mContext: Context) {

    @Provides
    fun provideContext(): Context {
        return mContext
    }
}