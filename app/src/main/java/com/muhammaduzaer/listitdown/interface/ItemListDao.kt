package com.muhammaduzaer.listitdown.`interface`

import androidx.lifecycle.LiveData
import androidx.room.*
import androidx.room.Dao
import com.muhammaduzaer.listitdown.models.ListItems

@Dao
interface ItemListDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(item: ListItems)

    @Delete
    suspend fun delete(item: ListItems)

    @Query("SELECT * FROM listItems")
    fun getAllListItems(): LiveData<List<ListItems>>
}