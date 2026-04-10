package com.example.lab3mobile

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.lab3mobile.adapter.RecipeAdapter
import com.example.lab3mobile.model.RecipeRepository

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerViewRecipes)

        val recipes = RecipeRepository().getRecipes()

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = RecipeAdapter(this, recipes)
    }
}