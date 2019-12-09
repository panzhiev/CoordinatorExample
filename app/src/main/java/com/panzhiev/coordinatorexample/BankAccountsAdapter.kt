package com.panzhiev.coordinatorexample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BankAccountsAdapter : RecyclerView.Adapter<BankAccountsAdapter.BankAccountViewHolder?>() {

    private val items = arrayListOf("One", "Two", "Three")

    inner class BankAccountViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(s: String) {
            itemView.findViewById<TextView>(R.id.bank_account_name_tv).text = s
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BankAccountViewHolder {
        val view: View = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_bank_account, parent, false)
        return BankAccountViewHolder(view)
    }

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: BankAccountViewHolder, position: Int) {
        holder.bind(items[position])
    }
}