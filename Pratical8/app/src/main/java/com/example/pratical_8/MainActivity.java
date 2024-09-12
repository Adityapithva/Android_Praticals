package com.example.pratical_8;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckBox checkBox = findViewById(R.id.checkBox);
        final TextView checkBoxStatus = findViewById(R.id.checkBoxStatus);

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    checkBoxStatus.setText("Checkbox status: Selected");
                } else {
                    checkBoxStatus.setText("Checkbox status: Not selected");
                }
            }
        });

        RadioGroup radioGroup = findViewById(R.id.radioGroup);
        final TextView radioButtonStatus = findViewById(R.id.radioButtonStatus);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton selectedRadioButton = findViewById(checkedId);
                radioButtonStatus.setText("Selected: " + selectedRadioButton.getText());
            }
        });
    }
}
