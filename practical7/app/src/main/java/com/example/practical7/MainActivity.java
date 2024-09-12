package com.example.practical7;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.myButton);
        EditText editText = findViewById(R.id.myEditText);
        button.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(MainActivity.this, "Button Long Clicked!", Toast.LENGTH_SHORT).show();
                return true; // Return true to indicate the event was handled
            }
        });
        editText.setOnLongClickListener(view -> {
            Toast.makeText(MainActivity.this, "EditText Long Clicked!", Toast.LENGTH_SHORT).show();
            return true;
        });
    }
}
