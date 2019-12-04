package com.example.cocktailthing.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RecipeResponse {

    private int totalMatchCount;

    @SerializedName("matches")
    private List<RecipeModel> recipes;


    public int getTotalMatchCount() {
        return totalMatchCount;
    }

    public List<RecipeModel> getRecipes() {
        return recipes;
    }
}
