package com.bcg.life.view.exception

import android.content.Context
import com.bcg.life.R
import com.bcg.life.view.BcgApp

class CustomException(var type: Type) : Exception() {

    var context: Context = BcgApp.contextComponent.getContext()

    enum class Type {
        INSERT_FAIL,
        UPDATE_FAIL,
        NO_RECORD_FOUND,
        NO_INTERNET
    }

    override fun getLocalizedMessage(): String {
        when (type) {
            Type.INSERT_FAIL -> {
                return context.resources.getString(R.string.data_write_fail)
            }
            Type.UPDATE_FAIL -> {
                return context.resources.getString(R.string.data_update_fail)
            }
            Type.NO_RECORD_FOUND -> {
                return context.getString(R.string.no_record_found)
            }
            Type.NO_INTERNET -> {
                return context.getString(R.string.connect_to_internet)
            }
        }
    }
}