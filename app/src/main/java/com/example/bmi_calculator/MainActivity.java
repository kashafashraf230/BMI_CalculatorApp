package com.example.bmi_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText userWeight, userHeight;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userWeight.findViewById(R.id.userWeight);
        userHeight.findViewById(R.id.userHeight);
        button.findViewById(R.id.resultButton);

        String weightText = userWeight.getText().toString();
        String heightText = userHeight.getText().toString();

        Double weight = Double.parseDouble(weightText);
        Double height = Double.parseDouble(heightText);

    }
}