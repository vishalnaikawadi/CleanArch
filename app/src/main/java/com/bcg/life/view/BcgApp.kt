package com.bcg.life.view

import android.app.Application
import com.bcg.life.view.di.component.ApplicationComponent
import com.bcg.life.view.di.component.ContextComponent
import com.bcg.life.view.di.component.DaggerApplicationComponent
import com.bcg.life.view.di.component.DaggerContextComponent
import com.bcg.life.view.di.module.ContextModule

class BcgApp : Application() {


    companion object {
        private lateinit var sInstance: BcgApp
        lateinit var contextComponent: ContextComponent
       // lateinit var dataComponent: DataComponent
        //val component: ApplicationComponent = DaggerApplicationComponent.builder().build()
        fun getInstance(): BcgApp {
            return sInstance
        }
    }


    override fun onCreate() {
        super.onCreate()
        sInstance = this
        contextComponent = DaggerContextComponent.builder().contextModule(ContextModule(this)).build()
       // dataComponent = DaggerDataComponent.builder().contextModule(ContextModule(this)).build()
    }

}