package com.example.app2;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ImageView imageView = findViewById(R.id.imageView);

        ObjectAnimator rotateAnimator = ObjectAnimator.ofFloat(imageView, "rotation", 0f, 180f);
        rotateAnimator.setDuration(5000);
        rotateAnimator.setInterpolator(new LinearInterpolator());
        rotateAnimator.setRepeatCount(ObjectAnimator.INFINITE);
        rotateAnimator.start();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                rotateAnimator.cancel();
                Intent intent = new Intent(splash.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 5000);
    }
}
