package com.example.lab3mobile.model

import com.example.lab3mobile.R

class RecipeRepository {

    fun getRecipes(): List<Recipe> {
        return listOf(
            Recipe(1, R.string.day_1_title, R.string.day_1_description, R.string.day_1_recipe, R.drawable.day_1_picture),
            Recipe(2, R.string.day_2_title, R.string.day_2_description, R.string.day_2_recipe, R.drawable.day_2_picture),
            Recipe(3, R.string.day_3_title, R.string.day_3_description, R.string.day_3_recipe, R.drawable.day_3_picture),
            Recipe(4, R.string.day_4_title, R.string.day_4_description, R.string.day_4_recipe, R.drawable.day_4_picture),
            Recipe(5, R.string.day_5_title, R.string.day_5_description, R.string.day_5_recipe, R.drawable.day_5_picture),
            Recipe(6, R.string.day_6_title, R.string.day_6_description, R.string.day_6_recipe, R.drawable.day_6_picture),
            Recipe(7, R.string.day_7_title, R.string.day_7_description, R.string.day_7_recipe, R.drawable.day_7_picture),
            Recipe(8, R.string.day_8_title, R.string.day_8_description, R.string.day_8_recipe, R.drawable.day_8_picture),
            Recipe(9, R.string.day_9_title, R.string.day_9_description, R.string.day_9_recipe, R.drawable.day_9_picture),
            Recipe(10, R.string.day_10_title, R.string.day_10_description, R.string.day_10_recipe, R.drawable.day_10_picture),
            Recipe(11, R.string.day_11_title, R.string.day_11_description, R.string.day_11_recipe, R.drawable.day_11_picture),
            Recipe(12, R.string.day_12_title, R.string.day_12_description, R.string.day_12_recipe, R.drawable.day_12_picture),
            Recipe(13, R.string.day_13_title, R.string.day_13_description, R.string.day_13_recipe, R.drawable.day_13_picture),
            Recipe(14, R.string.day_14_title, R.string.day_14_description, R.string.day_14_recipe, R.drawable.day_14_picture),
            Recipe(15, R.string.day_15_title, R.string.day_15_description, R.string.day_15_recipe, R.drawable.day_15_picture),
            Recipe(16, R.string.day_16_title, R.string.day_16_description, R.string.day_16_recipe, R.drawable.day_16_picture),
            Recipe(17, R.string.day_17_title, R.string.day_17_description, R.string.day_17_recipe, R.drawable.day_17_picture),
            Recipe(18, R.string.day_18_title, R.string.day_18_description, R.string.day_18_recipe, R.drawable.day_18_picture),
            Recipe(19, R.string.day_19_title, R.string.day_19_description, R.string.day_19_recipe, R.drawable.day_19_picture),
            Recipe(20, R.string.day_20_title, R.string.day_20_description, R.string.day_20_recipe, R.drawable.day_20_picture),
            Recipe(21, R.string.day_21_title, R.string.day_21_description, R.string.day_21_recipe, R.drawable.day_21_picture),
            Recipe(22, R.string.day_22_title, R.string.day_22_description, R.string.day_22_recipe, R.drawable.day_22_picture),
            Recipe(23, R.string.day_23_title, R.string.day_23_description, R.string.day_23_recipe, R.drawable.day_23_picture),
            Recipe(24, R.string.day_24_title, R.string.day_24_description, R.string.day_24_recipe, R.drawable.day_24_picture),
            Recipe(25, R.string.day_25_title, R.string.day_25_description, R.string.day_25_recipe, R.drawable.day_25_picture),
            Recipe(26, R.string.day_26_title, R.string.day_26_description, R.string.day_26_recipe, R.drawable.day_26_picture),
            Recipe(27, R.string.day_27_title, R.string.day_27_description, R.string.day_27_recipe, R.drawable.day_27_picture),
            Recipe(28, R.string.day_28_title, R.string.day_28_description, R.string.day_28_recipe, R.drawable.day_28_picture),
            Recipe(29, R.string.day_29_title, R.string.day_29_description, R.string.day_29_recipe, R.drawable.day_29_picture),
            Recipe(30, R.string.day_30_title, R.string.day_30_description, R.string.day_30_recipe, R.drawable.day_30_picture)
        )
    }
}