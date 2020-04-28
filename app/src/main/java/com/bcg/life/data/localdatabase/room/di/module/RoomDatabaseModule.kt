package com.bcg.life.data.localdatabase.room.di.module

import android.content.Context
import androidx.room.Room
import com.bcg.life.data.localdatabase.room.BcgRoomDatabase
import com.bcg.life.data.localdatabase.room.RoomDatabaseConstant.Companion.DB_NAME
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RoomDatabaseModule {

    @Singleton
    @Provides
    fun provideBcgRoomDatabase(context: Context): BcgRoomDatabase {
        return Room.databaseBuilder(context, BcgRoomDatabase::class.java, DB_NAME)
            //.addMigrations()
            //.fallbackToDestructiveMigration() //comment this line if data persistence required
            .build()
    }
}