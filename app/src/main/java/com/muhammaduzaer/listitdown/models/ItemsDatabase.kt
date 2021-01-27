package com.muhammaduzaer.listitdown.models

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.muhammaduzaer.listitdown.`interface`.ItemListDao

@Database(
    entities = [ListItems::class],
    version = 1
)
abstract class ItemsDatabase : RoomDatabase() {

    abstract fun getItemListDao() : ItemListDao

    companion object {
        @Volatile
        private var instance: ItemsDatabase? = null
        private val LOCK = Any()

        operator fun invoke(context: Context) = instance ?: synchronized(LOCK) {
            instance ?: createDatabase(context).also { instance = it }
        }

        private fun createDatabase(context: Context) =
            Room.databaseBuilder(context.applicationContext,
            ItemsDatabase::class.java, "ItemListDB.db").build()
    }
}