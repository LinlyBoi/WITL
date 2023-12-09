package com.example.myapp_1;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class BeginActivity extends AppCompatActivity {


    private static final int SPLASH_DURATION = 3000; // 3 seconds
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_begin);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(BeginActivity.this, GetStart1Activity.class);
                startActivity(intent);
                finish(); // Optional, depending on your use case
            }
        }, SPLASH_DURATION); // 3000 milliseconds = 3 seconds
    }
}
