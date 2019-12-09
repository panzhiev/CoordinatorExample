package com.panzhiev.coordinatorexample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SimpleAdapter : RecyclerView.Adapter<SimpleAdapter.SimpleViewHolder?>() {

    private val items = arrayListOf("One", "Two")

    inner class SimpleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(s: String) {
            itemView.findViewById<TextView>(android.R.id.text1).text = s
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SimpleViewHolder {
        val view: View = LayoutInflater.from(parent.context)
                .inflate(R.layout.support_simple_spinner_dropdown_item, parent, false)
        return SimpleViewHolder(view)
    }

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: SimpleViewHolder, position: Int) {
        holder.bind(items[position])
    }
}