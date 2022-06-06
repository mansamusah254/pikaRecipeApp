package com.cookingapp.pika;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class RecipeActivity extends AppCompatActivity {
private Button mAddRecipeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        Intent intent = getIntent();
        String location = intent.getStringExtra("foodName");

//        mAddRecipeButton = (Button) findViewById(R.id.AddRecipeButton);
//        mAddRecipeButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                RecipeActivity();
//            }
//        });
//    }
//    public void RecipeActivity(){
//        Intent intent = new Intent(this, RecipeActivity.class);
//        startActivity(intent);
//    }
}}