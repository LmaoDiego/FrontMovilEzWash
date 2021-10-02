package com.ultimate.ezwash

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

class CarWash (
    val id: Int,
    val description: String,
    val name: String,
    val name_owner: String,
    val qualification: String,
    val available: String,
)