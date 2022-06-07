package com.cookingapp.pika;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LayoutActivity extends AppCompatActivity {
    private Button mMoreButton;
    private Button mAddRecipeButton;
    private EditText mfoodName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout);

        mfoodName = (EditText) findViewById(R.id.foodName);
        mAddRecipeButton = (Button) findViewById(R.id.AddRecipeButton);
        mAddRecipeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String foodName = mfoodName.getText().toString();
                Intent intent = new Intent(LayoutActivity.this,RecipeActivity.class);
                intent.putExtra("foodName", foodName);
                startActivity(intent);
            }
        });

        mMoreButton = (Button) findViewById(R.id.MoreButton);
        mMoreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LayoutActivity.this, "COMING SOON", Toast.LENGTH_SHORT).show();;
            }
        });
    }
}
