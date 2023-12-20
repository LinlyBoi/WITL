package com.example.myapp_1;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity {

    final int actionNotificationId = R.id.action_notification;
    final int actionSceduleId = R.id.action_schedule;
    final int actionPredictId = R.id.action_predict;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        BottomNavigationView bottomNavigationView = findViewById(R.id.homeBottomView);
        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        if (item.getItemId() == actionNotificationId) {

                            Intent intent = new Intent(HomeActivity.this, NotificationActivity.class);
                            startActivity(intent);

                        }else if(item.getItemId() == actionSceduleId){
                            Intent intent = new Intent(HomeActivity.this, Schedule.class);
                            startActivity(intent);
                        }else if (item.getItemId() == actionPredictId){
                            Intent intent = new Intent(HomeActivity.this, Predict.class);
                            startActivity(intent);
                        }else{
                            // do nothing
                        }
                        return true;
                    }
                });
        TextView userGreeting = findViewById(R.id.userGreeting);
        SharedPreferences currentUserThings = getSharedPreferences("userData", MODE_PRIVATE);
        String user = currentUserThings.getString("username", "");
        userGreeting.setText("Welcome " + user + "!");

    }
}

