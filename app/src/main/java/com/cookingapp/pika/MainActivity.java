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
    private Button mMoreButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mletsCookButton = (Button) findViewById(R.id.letsCookButton);
        mletsCookButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutActivity();
            }
        });
    }
    public void LayoutActivity(){
        Intent intent = new Intent(this, LayoutActivity.class);
        startActivity(intent);
    }
}
