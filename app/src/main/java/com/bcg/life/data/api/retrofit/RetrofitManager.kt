package com.bcg.life.data.api.retrofit

import com.bcg.life.data.api.ApiHelper
import com.bcg.life.data.api.retrofit.di.component.DaggerRetrofitComponent

class RetrofitManager : ApiHelper{

    private var networkAPI: NetworkAPI = DaggerRetrofitComponent.builder().build().getNetworkApi()

    override fun testMethod() {
        networkAPI.testMethod()
    }


}