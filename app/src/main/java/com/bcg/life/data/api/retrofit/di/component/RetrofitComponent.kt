package com.bcg.life.data.api.retrofit.di.component

import com.bcg.life.data.api.retrofit.NetworkAPI
import com.bcg.life.data.api.retrofit.di.module.RetrofitModule
import com.bcg.life.view.di.module.GsonModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [GsonModule::class, RetrofitModule::class])
interface RetrofitComponent {

    fun getNetworkApi(): NetworkAPI

}