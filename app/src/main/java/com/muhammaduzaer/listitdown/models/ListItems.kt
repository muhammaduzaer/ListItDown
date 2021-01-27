package com.muhammaduzaer.listitdown.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "listItems")
data class ListItems(
    @ColumnInfo(name = "itemName")
    var name: String,

    @ColumnInfo(name = "itemAmount")
    var amount: Int
) {
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null
}