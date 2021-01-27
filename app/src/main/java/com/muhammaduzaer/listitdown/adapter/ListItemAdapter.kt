package com.muhammaduzaer.listitdown.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.muhammaduzaer.listitdown.R
import com.muhammaduzaer.listitdown.models.ListItems
import com.muhammaduzaer.listitdown.ui.ListItemsViewModel
import kotlinx.android.synthetic.main.layout_list_item.view.*

class ListItemAdapter(
    private var items: List<ListItems>,
    private val viewModel: ListItemsViewModel
) : RecyclerView.Adapter<ListItemAdapter.ListItemViewHolder>() {

    inner class ListItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_list_item, parent, false)
        return ListItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListItemViewHolder, position: Int) {
        val currentItem = items[position]

        holder.itemView.textViewItemName.text = currentItem.name
        holder.itemView.textViewItemAmount.text = "${currentItem.amount}"

        holder.itemView.imageViewDelete.setOnClickListener {
            viewModel.delete(currentItem)
        }

        holder.itemView.imageViewAdd.setOnClickListener {
            currentItem.amount++
            viewModel.insert(currentItem)
        }

        holder.itemView.imageViewMinus.setOnClickListener {
            if (currentItem.amount > 0) {
                currentItem.amount--
                viewModel.insert(currentItem)
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

}