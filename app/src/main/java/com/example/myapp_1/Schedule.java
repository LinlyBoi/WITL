package com.example.myapp_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class Schedule extends AppCompatActivity {

    ImageView vec_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);
        vec_back = findViewById(R.id.ScheduleBackButton);
        vec_back.setOnClickListener(view -> {
            Intent newScreen = new Intent(getApplicationContext(), HomeActivity.class);
            startActivity(newScreen);
        });
    }
}