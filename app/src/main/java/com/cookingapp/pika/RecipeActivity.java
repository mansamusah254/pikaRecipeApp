package com.cookingapp.pika;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RecipeActivity extends AppCompatActivity {
@BindView(R.id.textView) TextView mTextView;
@BindView(R.id.foodName) ListView mFoodName;

    private String[] foodname = new String[] {"Sweet Hereafter", "Cricket", "Hawthorne Fish House", "Viking Soul Food", "Red Square", "Horse Brass", "Dick's Kitchen", "Taco Bell", "Me Kha Noodle Bar", "La Bonita Taqueria", "Smokehouse Tavern", "Pembiche", "Kay's Bar", "Gnarly Grey", "Slappy Cakes", "Mi Mero Mole" };
    private String[] chef = new String[] {"Vegan Food", "Breakfast", "Fishs Dishs", "Scandinavian", "Coffee", "English Food", "Burgers", "Fast Food", "Noodle Soups", "Mexican", "BBQ", "Cuban", "Bar Food", "Sports Bar", "Breakfast", "Mexican" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        ButterKnife.bind(this);
        RecipeAdapter adapter = new RecipeAdapter(this, android.R.layout.simple_list_item_1, foodname,chef);
        mFoodName.setAdapter(adapter);

        mFoodName.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String book = ((TextView)view).getText().toString();
                Log.v("RecipeActivity", "In the onItemClickListener!");
                Toast.makeText(RecipeActivity.this, book, Toast.LENGTH_LONG).show();
            }
        });

        Intent intent = getIntent();
        String foodName = intent.getStringExtra("foodName");

        mTextView.setText("Here are recipes: " + foodName);

    }
}