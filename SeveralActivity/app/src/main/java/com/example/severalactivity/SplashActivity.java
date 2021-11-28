package com.example.severalactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {
    ImageView logo;
    Animation start_anim;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        logo = findViewById(R.id.logo_picture);
        start_anim = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        logo.startAnimation(start_anim);
        intent = new Intent(SplashActivity.this, MainActivity.class);
        start_anim.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                startActivity(intent);
                SplashActivity.this.finish();
            }
            @Override
            public void onAnimationRepeat(Animation animation) {
            }
        });
    }
}