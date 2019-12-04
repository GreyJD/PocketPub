package com.example.cocktailthing;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.cocktailthing.model.RecipeModel;

public class RecipeViewHolder extends RecyclerView.ViewHolder {

    private TextView itemNameTextView;

    public RecipeViewHolder(View itemView) {
        super(itemView);
        itemNameTextView = itemView.findViewById(R.id.recipe_name);
    }

    public void bindView(RecipeModel model) {
        itemNameTextView.setText(model.getRecipeName());
    }

}
