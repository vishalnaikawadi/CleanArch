package com.bcg.life.view.di.component

import com.bcg.life.view.di.module.ApplicationModule
import com.bcg.life.view.di.module.GsonModule
import com.bcg.life.view.navigator.CustomActivityNavigator
import com.google.gson.Gson
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class, GsonModule::class])
interface ApplicationComponent {

    fun getCustomActivityNavigator(): CustomActivityNavigator

    fun getGson(): Gson

}