package com.muhammaduzaer.listitdown.repositories

import com.muhammaduzaer.listitdown.models.ItemsDatabase
import com.muhammaduzaer.listitdown.models.ListItems

class ItemsRepository(
    private val db: ItemsDatabase
) {
    suspend fun insert(item: ListItems) = db.getItemListDao().insert(item)

    suspend fun delete(item: ListItems) = db.getItemListDao().delete(item)

    fun getAllListItems() = db.getItemListDao().getAllListItems()
}