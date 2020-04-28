package com.bcg.life.data.localdatabase.room.table

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.bcg.life.data.localdatabase.room.RoomDatabaseConstant.Companion.TABLE_TEST
import com.bcg.life.data.localdatabase.room.RoomDatabaseConstant.Companion.TEST_DATA
import com.bcg.life.data.localdatabase.room.RoomDatabaseConstant.Companion.TEST_ID

@Entity(tableName = TABLE_TEST)
class TestTable {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = TEST_ID)
    var id: Int? = null

    @ColumnInfo(name = TEST_DATA)
    var data: String? = null
}