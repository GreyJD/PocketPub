package com.example.cocktailthing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button baseButton;
    private Button ingredientsButton;
    private Button foodButton;
    private Button occButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        baseButton = findViewById(R.id.base_button);
        ingredientsButton = findViewById(R.id.ingredients_button);
        foodButton = findViewById(R.id.food_button);
        occButton = findViewById(R.id.occasion_button);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Welcome to PocketPub!");
        baseButton.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View view) {
                                              Intent intent = new Intent(MainActivity.this, BaseMenu.class);
                                              startActivity(intent);

                                          }

                                      }
        );
        ingredientsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainActivity.this, Ingredients.class);
                startActivity(intent2);
            }
                                             }

        );
        foodButton.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View view) {
                                              Intent intent3 = new Intent(MainActivity.this, FoodPairings.class);
                                              startActivity(intent3);
                                          }
                                      }
        );
        occButton.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View view) {
                                             Intent intent4 = new Intent(MainActivity.this, Occasions.class);
                                             startActivity(intent4);
                                         }
                                     }
        );
    }
}
