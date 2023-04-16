package com.example.bmi_calculator;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.bmi_calculator.core.BMICalculator;

public class MainActivity extends AppCompatActivity {

    EditText userWeight, userHeight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userWeight = findViewById(R.id.userWeight);
        userHeight = findViewById(R.id.userHeight);

    }

    public void buttonClick(View v){

        String weightText = userWeight.getText().toString();
        String heightText = userHeight.getText().toString();

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

        String resultNote;

        if(bmiResult != -1){

            String resultCategory = bmiCalculator.getCategory(bmiResult);
            resultNote = "Your BMI index is: "+ String.format("%.2f", bmiResult)+ "\nBMI Category: "+ resultCategory;

            AlertDialog.Builder alert = new AlertDialog.Builder(this);
            alert.setTitle("BMI");
            alert.setMessage(resultNote);
            alert.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    userWeight.setText("");
                    userHeight.setText("");
                }
            });


            AlertDialog alertDialog = alert.create();
            alertDialog.show();

        }

        else{
            Toast.makeText(this, bmiCalculator.getErrorMsg(), Toast.LENGTH_SHORT).show();
        }

    }
}