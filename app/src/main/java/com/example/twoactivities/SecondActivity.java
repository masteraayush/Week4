package com.example.twoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView countText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        countText = findViewById(R.id.count_text_view);

        // get the count sent through intent from the first activity
        Intent intent = getIntent();
        String currentCount = intent.getStringExtra(MainActivity.EXTRA_COUNT);

        countText.setText(currentCount);
    }
}