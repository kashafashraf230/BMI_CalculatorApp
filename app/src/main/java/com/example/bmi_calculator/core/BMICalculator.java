package com.example.bmi_calculator.core;

public class BMICalculator {

    private String errorMsg;
    private String bmiCategory;
    private double bmiValue;

    public String getErrorMsg(){

        return errorMsg;
    }

    public double calculateBMI(double weight, double height){

        bmiValue = -1;

        if(height <= 0 || weight <= 0)
        {
            errorMsg = "Height or weight can't be zero";
        }

        else{
            bmiValue = (weight / ((height/100) * (height/100)));
        }
        return bmiValue;
    }

    public String getCategory(double bmiIndex){

        if(bmiIndex < 16){
            bmiCategory = "Severe Thinness";
        }
        else if (bmiIndex >= 16 && bmiIndex < 17) {
            bmiCategory = "Moderate Thinness";
        }
        else if (bmiIndex >= 17 && bmiIndex < 18.5) {
            bmiCategory = "Mild Thinness";
        }
        else if (bmiIndex >= 18.5 && bmiIndex < 25) {
            bmiCategory = "Normal";
        }
        else if (bmiIndex >= 25 && bmiIndex < 30) {
            bmiCategory = "Overweight";
        }
        else if (bmiIndex >= 30 && bmiIndex < 35) {
            bmiCategory = "Obese Class I";
        }
        else if (bmiIndex >= 35 && bmiIndex < 40) {
            bmiCategory = "Obese Class II";
        }
        else if (bmiIndex >= 40) {
            bmiCategory = "Obese Class III";
        }
        return bmiCategory;
    }
}
