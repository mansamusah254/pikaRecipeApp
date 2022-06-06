package com.cookingapp.pika;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button mletsCookButton;
    private Button mMoreButton;
    private Button mAddRecipeButton;
    private EditText mfoodName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mfoodName = (EditText) findViewById(R.id.foodName);
        mAddRecipeButton = (Button) findViewById(R.id.AddRecipeButton);
        mAddRecipeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String foodName = mfoodName.getText().toString();
                Intent intent = new Intent(MainActivity.this,RecipeActivity.class);
                intent.putExtra("foodName", foodName);
                startActivity(intent);
            }
        });


        mletsCookButton = (Button) findViewById(R.id.letsCookButton);
        mletsCookButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,LayoutActivity.class);
                startActivity(intent);
            }
        });
    }
}
