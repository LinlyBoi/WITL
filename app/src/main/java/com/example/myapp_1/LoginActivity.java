package com.example.myapp_1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    EditText username;
    EditText password;
    TextView forgetpassword;
    Button login;
    Button signup;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.editTextText);
        password = findViewById(R.id.editTextTextPassword);
        forgetpassword = findViewById(R.id.forgetpass);
        login = findViewById(R.id.button);
        signup = findViewById(R.id.button2);

        forgetpassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newScreen = new Intent(getApplicationContext(), PasswordResetActivity.class);
                startActivity(newScreen);
            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newScreen = new Intent(getApplicationContext(), SigninActivity.class);
                startActivity(newScreen);
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String username_data = username.getText().toString();
                String password_data = password.getText().toString();

                if(username_data.isEmpty() || password_data.isEmpty()){
                    Toast.makeText(LoginActivity.this,"Please fill your data!", Toast.LENGTH_LONG).show();
                }else{
                    // Check for user input if in database
                    // if found go to home page
                    // else keep in same page bitch
                    Intent newScreen = new Intent(getApplicationContext(), HomeActivity.class);
                    startActivity(newScreen);
                }

            }
        });
    }
}
