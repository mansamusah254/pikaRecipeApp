package com.cookingapp.pika;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    @BindView(R.id.letsCookButton) Button mLetsCookButton;
    @BindView(R.id.Title) TextView mTitle;
    @BindView(R.id.Welcome) TextView mWelcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mLetsCookButton.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        if(v == mLetsCookButton) {
            Intent intent = new Intent(MainActivity.this, LayoutActivity.class);
            startActivity(intent);
        }
    }
}
