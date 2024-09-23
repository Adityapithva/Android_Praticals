package com.example.pratical_11;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Spinner mySpinner;
    private ListView myListView;
    private ArrayList<String> items;
    private ArrayAdapter<String> listAdapter;
    private int selectedPosition = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mySpinner = findViewById(R.id.mySpinner);
        myListView = findViewById(R.id.myListView);
        Button btnAdd = findViewById(R.id.btnAdd);
        Button btnUpdate = findViewById(R.id.btnUpdate);
        Button btnRemove = findViewById(R.id.btnRemove);

        // Initializing data
        items = new ArrayList<>();
        items.add("Apple");
        items.add("Mango");
        items.add("Banana");

        // Setting up ListView adapter
        listAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items);
        myListView.setAdapter(listAdapter);

        // Setting up Spinner adapter
        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, items);
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(spinnerAdapter);

        // Handling ListView item selection
        myListView.setOnItemClickListener((parent, view, position, id) -> {
            selectedPosition = position;
            Toast.makeText(MainActivity.this, "Selected: " + items.get(position), Toast.LENGTH_SHORT).show();
        });

        // Handling Spinner item selection
        mySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Spinner selected: " + items.get(position), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }

        });

        // Add item operation
        btnAdd.setOnClickListener(v -> {
            items.add("New Item");
            listAdapter.notifyDataSetChanged();
            spinnerAdapter.notifyDataSetChanged();
        });

        // Update item operation
        btnUpdate.setOnClickListener(v -> {
            if (selectedPosition != -1) {
                items.set(selectedPosition, "Updated Item");
                listAdapter.notifyDataSetChanged();
                spinnerAdapter.notifyDataSetChanged();
            } else {
                Toast.makeText(MainActivity.this, "No item selected to update", Toast.LENGTH_SHORT).show();
            }
        });

        // Remove item operation
        btnRemove.setOnClickListener(v -> {
            if (selectedPosition != -1) {
                items.remove(selectedPosition);
                listAdapter.notifyDataSetChanged();
                spinnerAdapter.notifyDataSetChanged();
                selectedPosition = -1;  // Reset selection
            } else {
                Toast.makeText(MainActivity.this, "No item selected to remove", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
