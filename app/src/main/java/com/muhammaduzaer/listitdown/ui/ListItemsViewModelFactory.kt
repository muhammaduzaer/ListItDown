package com.muhammaduzaer.listitdown.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.muhammaduzaer.listitdown.repositories.ItemsRepository

@Suppress("UNCHECKED_CAST")
class ListItemsViewModelFactory(
    private val repository: ItemsRepository
) : ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return ListItemsViewModel(repository) as T
    }
}