package com.mkemp.recyclerviewdemo1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MyRecyclerViewAdapter : RecyclerView.Adapter<MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val listItem = layoutInflater.inflate(R.layout.list_item, parent, false)
        return MyViewHolder(listItem)
    }

    override fun getItemCount(): Int {
        return 5 // 5 rows
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

    }
}

class MyViewHolder(val view : View) : RecyclerView.ViewHolder(view) {

}