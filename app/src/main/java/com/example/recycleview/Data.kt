package com.example.recycleview

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "data_table")
data class Data(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    @ColumnInfo(name = "data_name")
    val name: String,
    @ColumnInfo(name = "data_detail")
    val detail: String,
    @ColumnInfo(name = "data_image")
    val image: Int,
)
