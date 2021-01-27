package com.muhammaduzaer.listitdown.ui

import androidx.lifecycle.ViewModel
import com.muhammaduzaer.listitdown.models.ListItems
import com.muhammaduzaer.listitdown.repositories.ItemsRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ListItemsViewModel (private val repository: ItemsRepository) : ViewModel() {

    fun insert(item: ListItems) = CoroutineScope(Dispatchers.Main).launch {
        repository.insert(item)
    }

    fun delete(item: ListItems) = CoroutineScope(Dispatchers.Main).launch {
        repository.delete(item)
    }

    fun getAllListItems() = repository.getAllListItems()
}