package com.example.myapp_1;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class GetStart2Activity extends AppCompatActivity {

    TextView _skip_;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_start_2);

        _skip_ = findViewById(R.id._skip_);
        next = findViewById(R.id.button6);

        _skip_.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent newScreen = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(newScreen);
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent newScreen = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(newScreen);
            }
        });
    }

}
