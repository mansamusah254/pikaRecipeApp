package com.cookingapp.pika;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button mletsCookButton;
    private EditText mFoodNameEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFoodNameEditText = (EditText)findViewById(R.id.FoodName)
        mletsCookButton = (Button)findViewById(R.id.letsCookButton);
         mletsCookButton.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(MainActivity.this, RecipeActivity.class);
                 startActivity(intent);
//                 intent.putExtra("Food Name", food name);
                 startActivity(intent);
             }
         });
    }


}