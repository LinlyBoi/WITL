package com.example.myapp_1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Predict extends AppCompatActivity {

    ImageView vec_back;
    EditText edi_station;
    EditText edi_weather;
    Button btn_pred;
    TextView txt_station;
    TextView txt_pred_time;
    ProgressBar prog_bar;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_predict);

        vec_back = findViewById(R.id.predictBackButton);
        edi_station = findViewById(R.id.editTextText);
        edi_weather = findViewById(R.id.editTextText2);
        btn_pred = findViewById(R.id.button4);
        prog_bar = findViewById(R.id.progressBar);
        txt_station = findViewById(R.id.textView4);
        txt_pred_time = findViewById(R.id.predicted_time);

        vec_back.setOnClickListener(view -> {
            Intent newScreen = new Intent(getApplicationContext(), HomeActivity.class);
            startActivity(newScreen);
        });

        btn_pred.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String station = edi_station.getText().toString();
                String weather = edi_weather.getText().toString();

                if(station.isEmpty() || weather.isEmpty()) {
                    Toast.makeText(Predict.this, "Please enter something", Toast.LENGTH_SHORT).show();
                }else{
                    // we will pass the input features to the model to predict
                    // then display predictions

                    txt_station.setText(station);

                    Thread thread = new Thread(new Runnable() {
                        @Override
                        public void run() {
                            for(int i = 0; i < 10; i++){
                                prog_bar.incrementProgressBy(10);
                                SystemClock.sleep(500);
                            }
                            prog_bar.setVisibility(View.GONE);

                            long currentTimeMillis = System.currentTimeMillis();
                            // Create a SimpleDateFormat object to format the time
                            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                            // Format the time and set it to the TextView
                            txt_pred_time.setText(sdf.format(new Date(currentTimeMillis)));
                        }
                    });
                    thread.start();

                }
            }
        });
    }
}