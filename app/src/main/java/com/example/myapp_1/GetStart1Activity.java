package com.example.myapp_1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class GetStart1Activity extends AppCompatActivity {

    TextView skip;
    Button getstarted;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_start_1);

        skip = findViewById(R.id.skip);
        getstarted = findViewById(R.id.button5);

        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent newScreen = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(newScreen);
            }
        });

        getstarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent newScreen = new Intent(getApplicationContext(), GetStart2Activity.class);
                startActivity(newScreen);
            }
        });
    }
}
