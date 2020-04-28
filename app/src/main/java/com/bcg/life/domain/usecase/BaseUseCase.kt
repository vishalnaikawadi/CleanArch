package com.bcg.life.domain.usecase

import com.bcg.life.data.api.ApiHelper
import com.bcg.life.data.di.component.DaggerDataComponent
import com.bcg.life.data.localdatabase.LocalDatabaseHelper

open class BaseUseCase {

    var dataComponent = DaggerDataComponent.builder().build()
    var apiHelper: ApiHelper = dataComponent.getApi()
    var localDatabaseHelper: LocalDatabaseHelper = dataComponent.getLocalDatabase()

}