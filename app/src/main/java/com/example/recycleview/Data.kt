package com.example.recycleview

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "data_table")
data class Data(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val name: String,
    val detail: String,
    val image: Int,
)
