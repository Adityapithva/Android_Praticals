package com.example.pratical_10;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {

    EditText editUsername, editAge;
    Button btnSave, btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        editUsername = findViewById(R.id.editUsername);
        editAge = findViewById(R.id.editAge);
        btnSave = findViewById(R.id.btnSave);
        btnNext = findViewById(R.id.btnNext);


        btnSave.setOnClickListener(v -> {

            SharedPreferences sharedPref = getSharedPreferences("UserPrefs", MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPref.edit();


            String username = editUsername.getText().toString();
            int age = Integer.parseInt(editAge.getText().toString());
            editor.putString("username", username);
            editor.putInt("age", age);
            editor.apply();

            editAge.setText("");
            editUsername.setText("");
        });


        btnNext.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        });
    }
}
