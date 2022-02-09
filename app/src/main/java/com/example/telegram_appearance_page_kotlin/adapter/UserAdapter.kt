package com.example.telegram_appearance_page_kotlin.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.telegram_appearance_page_kotlin.R
import com.example.telegram_appearance_page_kotlin.model.User


class UserAdapter(var context: Context, var items: ArrayList<User>):
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.item_custom_layout,parent,false)
            return UserItemViewHolder(view)

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        var item = items[position]


    }

    override fun getItemCount(): Int {
        return items.size
    }
}



class UserItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {

}


