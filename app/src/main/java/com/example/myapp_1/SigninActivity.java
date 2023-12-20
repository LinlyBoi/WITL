package com.example.myapp_1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapp_1.DB.DBOperations;

public class SigninActivity extends AppCompatActivity {

    EditText username;
    EditText phonenumber;
    EditText email;
    EditText password;

    Button register;

     DBOperations dbOperations = new DBOperations(this);

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        username = findViewById(R.id.editTextText2);
        phonenumber = findViewById(R.id.editTextText3);
        email = findViewById(R.id.editTextText5);
        password = findViewById(R.id.editTextTextPassword2);
        register = findViewById(R.id.button4);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username_data = username.getText().toString();
                String phonenumber_data = phonenumber.getText().toString();  // Corrected here
                String email_data = email.getText().toString();  // Corrected here
                String password_data = password.getText().toString();  // Corrected here

                boolean checked = false;

                String[] data = new String[4];
                data[0] = username_data;
                data[1] = phonenumber_data;
                data[2] = email_data;
                data[3] = password_data;



                for (int i = 0; i < data.length; i++) {
                    if (data[i].isEmpty()) {
                        Toast.makeText(SigninActivity.this, "Please fill your data!", Toast.LENGTH_LONG).show();
                        checked = false;
                        break;
                    } else {
                        checked = true;
                    }
                }

                if (checked) {
                    long newRowId = dbOperations.insertUser(data[0], data[1], data[2], data[3]);

                    if (newRowId != -1) {
                        Toast.makeText(SigninActivity.this, "SignUp Success", Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(SigninActivity.this, "SignUp failed" + newRowId, Toast.LENGTH_LONG).show();
                    }
                    Intent newScreen = new Intent(getApplicationContext(), LoginActivity.class);
                    startActivity(newScreen);
                }
            }
        });

    }
}


