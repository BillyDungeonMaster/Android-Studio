package com.example.calculatorbyxz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView firstvalue = findViewById(R.id.firstvalue), secondvalue = findViewById(R.id.secondvalue), result = findViewById(R.id.result);
    public void PlusButtonClick(View view){
        String a = firstvalue.toString(), b = secondvalue.toString();
        int n = Integer.parseInt(a), m = Integer.parseInt(b);
        result.setText(n + m);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}