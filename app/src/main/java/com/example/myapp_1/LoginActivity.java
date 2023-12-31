package com.example.myapp_1;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapp_1.DB.DBOperations;

public class LoginActivity extends AppCompatActivity {
    SharedPreferences currentUserThings;

    EditText username;
    EditText password;
    Button login;
    Button signup;


    DBOperations dbOperations = new DBOperations(this);
    Button guestLogin;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        currentUserThings = getSharedPreferences("UserData", MODE_PRIVATE);
        username = findViewById(R.id.editTextText);
        password = findViewById(R.id.editTextTextPassword);

        login = findViewById(R.id.loginButton);
        signup = findViewById(R.id.signupButton);
        guestLogin= findViewById(R.id.guestButton);

        SharedPreferences.Editor editor = currentUserThings.edit();
        signup.setOnClickListener(v -> {
            Intent newScreen = new Intent(getApplicationContext(), SigninActivity.class);
            startActivity(newScreen);
        });

        guestLogin.setOnClickListener(v -> {
            editor.putString("username", "Guest");
            editor.apply();
            Intent newScreen = new Intent(getApplicationContext(), HomeActivity.class);
            startActivity(newScreen);
        });
        login.setOnClickListener(v -> {

            String username_data = username.getText().toString();
            String password_data = password.getText().toString();

            if(username_data.isEmpty() || password_data.isEmpty()){
                Toast.makeText(LoginActivity.this,"Please fill your data!", Toast.LENGTH_LONG).show();
            }else{
                if (dbOperations.checkLoginCredentials(username_data, password_data)) {
                    // Login successful
                    // Proceed to the next screen or perform other actions
                    Toast.makeText(LoginActivity.this,"Welcome", Toast.LENGTH_LONG).show();
                    editor.putString("username", username_data);
                    editor.apply();
                    Intent newScreen = new Intent(getApplicationContext(), HomeActivity.class);
                    startActivity(newScreen);

                } else {
                    // Login failed

                    Toast.makeText(LoginActivity.this,"Invalid Iformation", Toast.LENGTH_LONG).show();

                }

            }

        });
    }
}
