package com.example.pratical_10;

import androidx.appcompat.app.AppCompatActivity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView textViewUsername, textViewAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Initialize views
        textViewUsername = findViewById(R.id.textViewUsername);
        textViewAge = findViewById(R.id.textViewAge);

        // Retrieve data from SharedPreferences
        SharedPreferences sharedPref = getSharedPreferences("UserPrefs", MODE_PRIVATE);
        String username = sharedPref.getString("username", "No username found");
        int age = sharedPref.getInt("age", 0);

        // Display the retrieved data
        textViewUsername.setText("Username: " + username);
        textViewAge.setText("Age: " + age);
    }
}
