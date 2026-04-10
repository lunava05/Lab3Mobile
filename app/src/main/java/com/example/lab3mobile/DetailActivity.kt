package com.example.lab3mobile

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val image = findViewById<ImageView>(R.id.detailImage)
        val title = findViewById<TextView>(R.id.detailTitle)
        val recipe = findViewById<TextView>(R.id.detailText)

        val titleId = intent.getIntExtra("title", 0)
        val recipeId = intent.getIntExtra("recipe", 0)
        val imageId = intent.getIntExtra("image", 0)

        title.setText(titleId)
        recipe.setText(recipeId)
        image.setImageResource(imageId)
    }
}