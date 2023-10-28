package com.example.myapp_1;

import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class login_page_activity extends Activity {


    private View _bg__login_page_ek2;
    private View rectangle_7;
    private View rectangle_6;
    private View _bg__iphone_status_bar_ek1;
    private ImageView wifi;
    private View _bg____battery_ek1;
    private ImageView fill;
    private ImageView outline;
    private ImageView reception;
    private TextView time;
    private TextView username;
    private TextView forgot_password_;
    private TextView password;
    private View _bg__group_12_ek1;
    private View rectangle_8;
    private TextView login;
    private TextView don_t_have_an_account__sign_up;
    private View home_indicator;
    private ImageView image_3;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page);


        _bg__login_page_ek2 = (View) findViewById(R.id._bg__login_page_ek2);
        rectangle_7 = (View) findViewById(R.id.rectangle_7);
        rectangle_6 = (View) findViewById(R.id.rectangle_6);
        _bg__iphone_status_bar_ek1 = (View) findViewById(R.id._bg__iphone_status_bar_ek1);
        wifi = (ImageView) findViewById(R.id.wifi);
        _bg____battery_ek1 = (View) findViewById(R.id._bg____battery_ek1);
        fill = (ImageView) findViewById(R.id.fill);
        outline = (ImageView) findViewById(R.id.outline);
        reception = (ImageView) findViewById(R.id.reception);
        time = (TextView) findViewById(R.id.time);
        username = (TextView) findViewById(R.id.username);
        forgot_password_ = (TextView) findViewById(R.id.forgot_password_);
        password = (TextView) findViewById(R.id.password);
        _bg__group_12_ek1 = (View) findViewById(R.id._bg__group_12_ek1);
        rectangle_8 = (View) findViewById(R.id.rectangle_8);
        login = (TextView) findViewById(R.id.login);
        don_t_have_an_account__sign_up = (TextView) findViewById(R.id.don_t_have_an_account__sign_up);
        home_indicator = (View) findViewById(R.id.home_indicator);
        image_3 = (ImageView) findViewById(R.id.image_3);


        //custom code goes here

    }
}

