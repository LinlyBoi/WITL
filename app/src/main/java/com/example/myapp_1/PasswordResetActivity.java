package com.example.myapp_1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class PasswordResetActivity extends AppCompatActivity {

    EditText email;
    Button reset;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password_reset);

        email = findViewById(R.id.editTextTextEmailAddress);
        reset = findViewById(R.id.guestButton);


        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email_data = email.getText().toString();

                if(email_data.isEmpty()){
                    Toast.makeText(PasswordResetActivity.this, "Please enter your email!", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(PasswordResetActivity.this, "Please check your email for password reset", Toast.LENGTH_LONG).show();
                    Intent newScreen = new Intent(getApplicationContext(), LoginActivity.class);
                    startActivity(newScreen);
                }

            }
        });
    }
}