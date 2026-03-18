package com.example.lab3mobile.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.lab3mobile.DetailActivity
import com.example.lab3mobile.R
import com.example.lab3mobile.model.Recipe

class RecipeAdapter(
    private val context: Context,
    private val recipes: List<Recipe>
) : RecyclerView.Adapter<RecipeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout, parent, false)

        return RecipeViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {

        val recipe = recipes[position]

        holder.textDay.text = context.getString(R.string.day, recipe.day)
        holder.textTitle.setText(recipe.titleId)
        holder.textDescription.setText(recipe.descriptionId)
        holder.imageRecipe.setImageResource(recipe.imageResId)

        holder.itemView.setOnClickListener {

            val intent = Intent(context, DetailActivity::class.java)

            intent.putExtra("title", recipe.titleId)
            intent.putExtra("recipe", recipe.fullTextId)
            intent.putExtra("image", recipe.imageResId)

            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return recipes.size
    }
}