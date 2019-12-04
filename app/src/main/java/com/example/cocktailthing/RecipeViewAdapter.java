package com.example.cocktailthing;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cocktailthing.model.RecipeModel;

import java.util.List;

public class RecipeViewAdapter extends RecyclerView.Adapter<RecipeViewHolder> {
    private String TAG = "RecipeViewAdapter";

    private List<RecipeModel> recipeCollection;

    public RecipeViewAdapter(List<RecipeModel> collection) {
        recipeCollection = collection;
    }

    @NonNull
    @Override
    public RecipeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.d(TAG, "onCreateViewHolder");
        View inflatedView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_list_item, parent, false);
        return new RecipeViewHolder(inflatedView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecipeViewHolder recipeViewHolder, int position) {
        Log.d(TAG, "onBindViewHolder: " + position);
        RecipeModel model = recipeCollection.get(position);
        recipeViewHolder.bindView(model);
    }

    @Override
    public int getItemCount() {
        return recipeCollection.size();
    }
}
