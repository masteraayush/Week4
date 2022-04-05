package com.example.twoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    String paragraphOne, paragraphTwo, paragraphThree;

    private static final String LOG_TAG =MainActivity.class.getSimpleName();
    public static final String EXTRA_MESSAGE ="com.example.android.twoactivities.extra.MESSAGE";
    public static final int TEXT_REQUEST = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        paragraphOne = getString(R.string.text_message_1);
        paragraphTwo = getString(R.string.text_message_2);
        paragraphThree = getString(R.string.text_message_3);
    }


    @Override
    public void onClick(View view) {
        int id = view.getId();
        Log.d("Hello t",id+" ");

        if(id==R.id.button1){
            Intent i = new Intent(this, SecondActivity.class);
            i.putExtra("Paragraph", paragraphOne);
            startActivity(i);
        }

        if(id==R.id.button2){
            Intent i = new Intent(this, SecondActivity.class);
            i.putExtra("Paragraph", paragraphTwo);
            startActivity(i);
        }

        if(id==R.id.button3){
            Intent i = new Intent(this, SecondActivity.class);
            i.putExtra("Paragraph", paragraphThree);
            startActivity(i);
        }
    }
}