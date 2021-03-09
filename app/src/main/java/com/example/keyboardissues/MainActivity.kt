package com.example.keyboardissues

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val data = listOf(
        Item("John", 1),
        Item("Ann", 4),
        Item("Jacob", 1, false),
        Item("Muhammed", 3),
        Item("Lisa", 5),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rvItems = findViewById<RecyclerView>(R.id.rvItems)
        rvItems.layoutManager = LinearLayoutManager(this)

        val itemAdapter = CustomAdapter(data)
        rvItems.adapter = itemAdapter
    }
}
