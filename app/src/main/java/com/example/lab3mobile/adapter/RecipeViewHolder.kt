package com.example.lab3mobile.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.lab3mobile.R

class RecipeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val textDay: TextView = itemView.findViewById(R.id.textDay)
    val textTitle: TextView = itemView.findViewById(R.id.textTitle)
    val textDescription: TextView = itemView.findViewById(R.id.textDescription)
    val imageRecipe: ImageView = itemView.findViewById(R.id.imageRecipe)

}