package com.example.bmi_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.bmi_calculator.core.BMICalculator;

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


        button.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){

                Double weight = 0.00;
                Double height = 0.00;

                if(!weightText.equals("") && Double.parseDouble(weightText) != 0){
                   weight = Double.parseDouble(weightText);
                }

                if(!heightText.equals("") && Double.parseDouble(heightText) != 0){
                    height = Double.parseDouble(heightText);
                }

                BMICalculator bmiCalculator = new BMICalculator();

                Double bmiResult =bmiCalculator.calculateBMI(weight, height);

            }

        });

    }
}