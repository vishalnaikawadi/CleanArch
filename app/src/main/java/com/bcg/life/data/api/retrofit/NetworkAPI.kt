package com.bcg.life.data.api.retrofit

import retrofit2.http.GET

interface NetworkAPI {

    @GET
    fun testMethod()

}