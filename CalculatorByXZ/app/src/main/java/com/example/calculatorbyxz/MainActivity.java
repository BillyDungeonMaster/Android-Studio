package com.example.calculatorbyxz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    static TextView first_value, second_value, result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        first_value = findViewById(R.id.firstvalue);
        second_value = findViewById(R.id.secondvalue);
        result = findViewById(R.id.result);
    }
    public static boolean isDigit(String s) throws NumberFormatException {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public void PlusButtonClick(View view){
        if(isDigit(String.valueOf(first_value.getText())) && isDigit(String.valueOf(second_value.getText()))){
            double n = Double.parseDouble(String.valueOf(first_value.getText())), m = Double.parseDouble(String.valueOf(second_value.getText()));
            result.setText(String.valueOf(n + m));
        }
        else{
            result.setText("Error! Value incorrect.");
        }
    }
    public void MinusButtonClick(View view){
        if(isDigit(String.valueOf(first_value.getText())) && isDigit(String.valueOf(second_value.getText()))){
            double n = Double.parseDouble(String.valueOf(first_value.getText())), m = Double.parseDouble(String.valueOf(second_value.getText()));
            result.setText(String.valueOf(n - m));
        }
        else{
            result.setText("Error! Value incorrect.");
        }
    }
    public void DivideButtonClick(View view){
        if(isDigit(String.valueOf(first_value.getText())) && isDigit(String.valueOf(second_value.getText()))){
            double n = Double.parseDouble(String.valueOf(first_value.getText())), m = Double.parseDouble(String.valueOf(second_value.getText()));
            result.setText(String.valueOf(n / m));
        }
        else{
            result.setText("Error! Value incorrect.");
        }
    }
    public void ScaleButtonClick(View view){
        if(isDigit(String.valueOf(first_value.getText())) && isDigit(String.valueOf(second_value.getText()))){
            double n = Double.parseDouble(String.valueOf(first_value.getText())), m = Double.parseDouble(String.valueOf(second_value.getText()));
            result.setText(String.valueOf(n * m));
        }
        else{
            result.setText("Error! Value incorrect.");
        }
    }
}