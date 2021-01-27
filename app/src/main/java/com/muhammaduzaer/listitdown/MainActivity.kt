package com.muhammaduzaer.listitdown

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.muhammaduzaer.listitdown.models.ItemsDatabase
import com.muhammaduzaer.listitdown.repositories.ItemsRepository
import com.muhammaduzaer.listitdown.ui.ListItemsViewModel
import com.muhammaduzaer.listitdown.ui.ListItemsViewModelFactory

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val database = ItemsDatabase(this)
        val repository = ItemsRepository(database)
        val factory = ListItemsViewModelFactory(repository)

        val viewModel = ViewModelProvider(this, factory).get(ListItemsViewModel::class.java)
    }
}