package com.bcg.life.view.di.component

import android.content.Context
import com.bcg.life.view.di.module.ApplicationModule
import com.bcg.life.view.di.module.ContextModule
import com.bcg.life.view.di.module.GsonModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ContextModule::class])
interface ContextComponent {

    fun getContext(): Context

}