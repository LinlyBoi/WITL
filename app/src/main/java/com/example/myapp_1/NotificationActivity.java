package com.example.myapp_1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class NotificationActivity extends AppCompatActivity {
ImageView vec_back;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        vec_back = findViewById(R.id.notificationBackButton);
        vec_back.setOnClickListener(view -> {
            Intent newScreen = new Intent(getApplicationContext(), HomeActivity.class);
            startActivity(newScreen);
        });
    }
}
