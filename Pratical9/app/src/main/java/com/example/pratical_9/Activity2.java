package com.example.pratical_9;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle sis){
        super.onCreate(sis);
        setContentView(R.layout.activity2);
        TextView receivedText = findViewById(R.id.receivedData);
        Intent intent = getIntent();
        String name = intent.getStringExtra("Extra_Name");
        receivedText.setText("Hello, "+name);
    }
}
