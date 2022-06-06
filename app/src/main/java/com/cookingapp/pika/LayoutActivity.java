package com.cookingapp.pika;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LayoutActivity extends AppCompatActivity {
    private Button mMoreButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout);
        mMoreButton = (Button) findViewById(R.id.MoreButton);
        mMoreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LayoutActivity.this, "COMING SOON", Toast.LENGTH_SHORT).show();;
            }
        });
    }
}
