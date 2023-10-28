
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		bxs_wallet
	 *	@date 		Saturday 28th of October 2023 06:22:01 AM
	 *	@title 		Page 1
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
	

package com.example.myapp_1;

import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;

public class sign_in_activity extends Activity {

	
	private View _bg__sign_in_ek2;
	private View _bg__iphone_status_bar_ek1;
	private ImageView wifi;
	private View _bg____battery_ek1;
	private ImageView fill;
	private ImageView outline;
	private ImageView reception;
	private TextView time;
	private TextView register;
	private View _bg___eva_arrow_ios_back_fill_ek1;
	private ImageView vector;
	private View _home_indicator;
	private View rectangle_38;
	private View rectangle_42;
	private View rectangle_40;
	private View rectangle_39;
	private View rectangle_41;
	private TextView name;
	private TextView phone_number;
	private TextView email;
	private TextView nic_number;
	private TextView password;
	private View ellipse_11;
	private View _bg__group_11_ek1;
	private View rectangle_8;
	private TextView create_account;
	private View _bg__ant_design_user_add_outlined_ek1;
	private ImageView vector_ek1;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.sign_in);

		
		_bg__sign_in_ek2 = (View) findViewById(R.id._bg__sign_in_ek2);
		_bg__iphone_status_bar_ek1 = (View) findViewById(R.id._bg__iphone_status_bar_ek1);
		wifi = (ImageView) findViewById(R.id.wifi);
		_bg____battery_ek1 = (View) findViewById(R.id._bg____battery_ek1);
		fill = (ImageView) findViewById(R.id.fill);
		outline = (ImageView) findViewById(R.id.outline);
		reception = (ImageView) findViewById(R.id.reception);
		time = (TextView) findViewById(R.id.time);
		register = (TextView) findViewById(R.id.register);
		_bg___eva_arrow_ios_back_fill_ek1 = (View) findViewById(R.id._bg___eva_arrow_ios_back_fill_ek1);
		vector = (ImageView) findViewById(R.id.vector);
		_home_indicator = (View) findViewById(R.id._home_indicator);
		rectangle_38 = (View) findViewById(R.id.rectangle_38);
		rectangle_42 = (View) findViewById(R.id.rectangle_42);
		rectangle_40 = (View) findViewById(R.id.rectangle_40);
		rectangle_39 = (View) findViewById(R.id.rectangle_39);
		rectangle_41 = (View) findViewById(R.id.rectangle_41);
		name = (TextView) findViewById(R.id.name);
		phone_number = (TextView) findViewById(R.id.phone_number);
		email = (TextView) findViewById(R.id.email);
		nic_number = (TextView) findViewById(R.id.nic_number);
		password = (TextView) findViewById(R.id.password);
		ellipse_11 = (View) findViewById(R.id.ellipse_11);
		_bg__group_11_ek1 = (View) findViewById(R.id._bg__group_11_ek1);
		rectangle_8 = (View) findViewById(R.id.rectangle_8);
		create_account = (TextView) findViewById(R.id.create_account);
		_bg__ant_design_user_add_outlined_ek1 = (View) findViewById(R.id._bg__ant_design_user_add_outlined_ek1);
		vector_ek1 = (ImageView) findViewById(R.id.vector_ek1);
	
		
		_home_indicator.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), begin_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	