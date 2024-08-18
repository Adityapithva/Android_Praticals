package com.example.pratical_4;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.tv);
        logAndDisplay("onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        logAndDisplay("onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        logAndDisplay("onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        logAndDisplay("onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        logAndDisplay("onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        logAndDisplay("onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        logAndDisplay("onDestroy");
    }

    private void logAndDisplay(String methodName) {
        String message = methodName + " called";
        Log.d("LifecycleDemo", message);
        tv.setText(message);
    }
}
