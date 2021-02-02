package com.aakib.animation;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

    LottieAnimationView lottieAnimationView;
    Button covid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        lottieAnimationView = findViewById(R.id.animation);
        covid = findViewById(R.id.covid);
        covid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lottieAnimationView.setVisibility(View.VISIBLE);
                covid.setVisibility(View.INVISIBLE);
                lottieAnimationView.playAnimation();
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent=new Intent(MainActivity.this,DetailActivity.class);
                        startActivity(intent);
                        MainActivity.this.finish();
                    }
                },1000);
            }
        });

    }
}