package com.bcg.life.data.localdatabase.room

import com.bcg.life.data.localdatabase.LocalDatabaseHelper
import com.bcg.life.data.localdatabase.room.di.component.DaggerRoomDatabaseComponent
import com.bcg.life.view.BcgApp
import com.bcg.life.view.di.module.ContextModule

class RoomDatabaseManager : LocalDatabaseHelper {

    private var localRoomDatabase: BcgRoomDatabase = DaggerRoomDatabaseComponent.builder().contextModule(
        ContextModule(BcgApp.getInstance())).build().getRoomDatabase()

    override fun testMethod() {
        localRoomDatabase.getTestDao()
    }


}