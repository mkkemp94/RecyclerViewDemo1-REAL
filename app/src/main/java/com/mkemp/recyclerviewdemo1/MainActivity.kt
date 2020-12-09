package com.mkemp.recyclerviewdemo1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity()
{
    val fruitsList = listOf(
        Fruit("Mango", "Tom"),
        Fruit("Apple", "Joe"),
        Fruit("Banana", "Marl"),
        Fruit("Pear", "Tom"),
        Fruit("Orange", "Joe")
    )

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        // Kotlin Synthetic -- no findViewById or Data Binding
        // Not recommended for larger projects
        my_recycler_view.setBackgroundColor(Color.YELLOW)
        my_recycler_view.layoutManager = LinearLayoutManager(this)
        my_recycler_view.adapter = MyRecyclerViewAdapter(fruitsList)
    }
}