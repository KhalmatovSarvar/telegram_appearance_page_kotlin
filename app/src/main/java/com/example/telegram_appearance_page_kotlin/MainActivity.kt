package com.example.telegram_appearance_page_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.telegram_appearance_page_kotlin.adapter.UserAdapter
import com.example.telegram_appearance_page_kotlin.model.User

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        recyclerView = findViewById(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)

        refreshAdapter(getUsers())
    }

    private fun refreshAdapter(items: ArrayList<User>) {
        val adapter = UserAdapter(this,items)
        recyclerView.adapter = adapter

    }

    private fun getUsers(): ArrayList<User> {
        var items: ArrayList<User> = ArrayList()

        for (i in 0..10){
            items.add(User("NOtification $i"))
        }
        return items
    }
}