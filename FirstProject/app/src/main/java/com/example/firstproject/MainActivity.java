package com.example.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView ConditionOfActivity;
        setContentView(R.layout.activity_main);
        ConditionOfActivity = findViewById(R.id.condition);
        ConditionOfActivity.append("\n Activity is created;");
    }

    public void onStart(){
        super.onStart();
        TextView ConditionOfActivity;
        ConditionOfActivity = findViewById(R.id.condition);
        ConditionOfActivity.append("\n Activity is started;");
    }

    public void onResume(){
        super.onResume();
        TextView ConditionOfActivity;
        ConditionOfActivity = findViewById(R.id.condition);
        ConditionOfActivity.append("\n Activity is continue;");
    }

    public void onPause(){
        super.onPause();
        TextView ConditionOfActivity;
        ConditionOfActivity = findViewById(R.id.condition);
        ConditionOfActivity.append("\n Activity is paused;");
    }

    public void onStop(){
        super.onStop();
        TextView ConditionOfActivity;
        ConditionOfActivity = findViewById(R.id.condition);
        ConditionOfActivity.append("\n Activity is stopped;");
    }

    public void onDestroy(){
        super.onDestroy();
        TextView ConditionOfActivity;
        ConditionOfActivity = findViewById(R.id.condition);
        ConditionOfActivity.append("\n Activity is destroyed;");
    }

    public void onRestart(){
        super.onRestart();
        TextView ConditionOfActivity;
        ConditionOfActivity = findViewById(R.id.condition);
        ConditionOfActivity.append("\n Activity is restarted");
    }
}