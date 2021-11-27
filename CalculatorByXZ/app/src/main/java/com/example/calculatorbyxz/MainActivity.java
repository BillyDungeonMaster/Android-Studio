package com.example.calculatorbyxz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    static TextView first_value, second_value, result;
    public void PlusButtonClick(View view){
        int n = Integer.parseInt(first_value.toString()), m = Integer.parseInt(second_value.toString());
        result.setText(String.valueOf(n + m));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        first_value = findViewById(R.id.firstvalue);
        second_value = findViewById(R.id.secondvalue);
        result = findViewById(R.id.result);
    }
}