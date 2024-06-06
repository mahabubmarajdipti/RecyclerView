package com.example.recycleview

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface DataDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(data: Data)

    @Delete
    suspend fun delete(data: Data)

    @Query("SELECT * FROM data_table ORDER BY id ASC")
    suspend fun getAllData(): List<Data>
}