package com.bcg.life.data.localdatabase.room.di.component

import com.bcg.life.data.localdatabase.room.BcgRoomDatabase
import com.bcg.life.data.localdatabase.room.di.module.RoomDatabaseModule
import com.bcg.life.view.di.module.ContextModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [RoomDatabaseModule::class,
    ContextModule::class])
interface RoomDatabaseComponent {

    fun getRoomDatabase(): BcgRoomDatabase
}