package com.brainstorm21.connectedbadarganj

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class AdapterForRecyclerView : RecyclerView.Adapter<AdapterForRecyclerView.ViewHolder>() {


    private val arr = mutableListOf<String>("Hi", "Hey", "Hello")
    private val arr2 = mutableListOf<String>("Hi, there", "Hey, there", "Hello, there")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.child_layout_for_rv, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.title.text = arr[position]
        holder.subtitle.text = arr2[position]
    }

    override fun getItemCount(): Int {
       return arr.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val title: TextView = itemView.findViewById(R.id.tv_rv_child_title)
        val subtitle: TextView = itemView.findViewById(R.id.tv_rv_child_subtitle)

    }
}