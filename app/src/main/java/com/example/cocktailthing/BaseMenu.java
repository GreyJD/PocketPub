package com.example.cocktailthing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BaseMenu extends AppCompatActivity {
    public Button vodka;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_menu);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Select an alcohol base");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        vodka = findViewById(R.id.vodka_button);
        vodka.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View view) {
                                         Intent intent = new Intent(BaseMenu.this, RecipeList.class);
                                         startActivity(intent);

                                     }

                                 }
        );
    }
}
