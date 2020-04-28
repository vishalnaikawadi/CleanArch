package com.bcg.life.data.localdatabase.room

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.bcg.life.data.localdatabase.room.dao.TestDao
import com.bcg.life.data.localdatabase.room.table.TestTable

@Database(entities = [TestTable::class], version = 1, exportSchema = false)
@TypeConverters(Converter::class)
abstract class BcgRoomDatabase : RoomDatabase() {

    abstract fun getTestDao(): TestDao
}