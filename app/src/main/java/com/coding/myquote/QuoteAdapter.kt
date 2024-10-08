package com.coding.myquote

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class QuoteAdapter(private val listReview:ArrayList<String>) : RecyclerView.Adapter<QuoteAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvItem: TextView = view.findViewById(R.id.tvItem)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuoteAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_quote, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: QuoteAdapter.ViewHolder, position: Int) {
        holder.tvItem.text = listReview[position]
    }

    override fun getItemCount(): Int {
        return listReview.size
    }

}