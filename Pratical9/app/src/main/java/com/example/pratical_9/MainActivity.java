package com.example.pratical_9;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText nameInput = findViewById(R.id.nameInput);
        Button sendButton = findViewById(R.id.sendButton);
        sendButton.setOnClickListener((View v) -> {
            String name = nameInput.getText().toString();
            Intent intent = new Intent(MainActivity.this,Activity2.class);
            intent.putExtra("Extra_Name",name);
            startActivity(intent);
        });
    }
}