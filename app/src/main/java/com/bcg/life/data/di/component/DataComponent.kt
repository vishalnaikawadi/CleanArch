package com.bcg.life.data.di.component

import com.bcg.life.data.api.ApiHelper
import com.bcg.life.data.di.module.DataModule
import com.bcg.life.data.localdatabase.LocalDatabaseHelper
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DataModule::class])
interface DataComponent {

    fun getApi(): ApiHelper

    fun getLocalDatabase(): LocalDatabaseHelper
}