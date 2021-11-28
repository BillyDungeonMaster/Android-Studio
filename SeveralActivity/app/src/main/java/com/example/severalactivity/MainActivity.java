package com.example.severalactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public boolean onCreateOptionsMenu(Menu menu){
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.main_menu, menu);
        menu.findItem(R.id.about_menu_item).setIntent(
                new Intent(this, AboutActivity.class)
        );
        menu.findItem(R.id.reference_menu_item).setIntent(
                new Intent(this, ReferenceActivity.class)
        );
        return true;
    }
}