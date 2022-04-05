package com.example.twoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private int currentCount = 0;
    TextView numberText;
    Button toastButton, countButton;
    final static String EXTRA_COUNT = "com.example.android.MainActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countButton = findViewById(R.id.count_btn);
        toastButton = findViewById(R.id.hello_btn);
        numberText = findViewById(R.id.count_text);

        countButton.setOnClickListener(this);
        toastButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.count_btn){
            countUp(view);
        }else if(view.getId()==R.id.hello_btn){
            launchSecondActivity();
        }
    }

    public void launchSecondActivity(){
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(EXTRA_COUNT, this.currentCount+"");
        startActivity(intent);
    }

    public void countUp(View view){
        currentCount++;
        numberText.setText(currentCount+"");
    }
}