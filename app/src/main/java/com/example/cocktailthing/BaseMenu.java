package com.example.cocktailthing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.cocktailthing.model.RecipeModel;
import com.example.cocktailthing.network.RecipeSearchAsyncTask;

import java.util.List;

public class BaseMenu extends AppCompatActivity {
    public Button vodka;

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_menu);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Select an alcohol base");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        recyclerView = findViewById(R.id.recycler_view);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getBaseContext());
        recyclerView.setLayoutManager(layoutManager);

        vodka = findViewById(R.id.vodka_button);
        vodka.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View view) {
                                         Intent intent = new Intent(BaseMenu.this, RecipeList.class);
                                         startActivity(intent);

                                         RecipeSearchAsyncTask task = new RecipeSearchAsyncTask();
                                         task.setListener(new RecipeSearchAsyncTask.RecipeListener() {
                                             @Override
                                             public void onRecipeCallback(List<RecipeModel> models) {
                                                 RecipeViewAdapter adapter = new RecipeViewAdapter(models);
                                                 recyclerView.setAdapter(adapter);
                                             }
                                         });

                                     }

                                 }
        );
    }
}
