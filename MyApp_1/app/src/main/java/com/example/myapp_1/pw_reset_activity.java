
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		bxs_wallet
	 *	@date 		Saturday 28th of October 2023 06:20:53 AM
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

public class pw_reset_activity extends Activity {

	
	private View _bg__pw_reset_ek2;
	private View rectangle_38;
	private View _bg__iphone_status_bar_ek1;
	private ImageView wifi;
	private View _bg____battery_ek1;
	private ImageView fill;
	private ImageView outline;
	private ImageView reception;
	private TextView time;
	private TextView enter_the_email_associated_with_your_account_;
	private TextView email_address;
	private TextView abcd_gmail_com;
	private View _bg__group_10_ek1;
	private View rectangle_1;
	private TextView send;
	private TextView reset_password;
	private View _bg___eva_arrow_ios_back_fill_ek1;
	private ImageView vector;
	private View _home_indicator;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.pw_reset);

		
		_bg__pw_reset_ek2 = (View) findViewById(R.id._bg__pw_reset_ek2);
		rectangle_38 = (View) findViewById(R.id.rectangle_38);
		_bg__iphone_status_bar_ek1 = (View) findViewById(R.id._bg__iphone_status_bar_ek1);
		wifi = (ImageView) findViewById(R.id.wifi);
		_bg____battery_ek1 = (View) findViewById(R.id._bg____battery_ek1);
		fill = (ImageView) findViewById(R.id.fill);
		outline = (ImageView) findViewById(R.id.outline);
		reception = (ImageView) findViewById(R.id.reception);
		time = (TextView) findViewById(R.id.time);
		enter_the_email_associated_with_your_account_ = (TextView) findViewById(R.id.enter_the_email_associated_with_your_account_);
		email_address = (TextView) findViewById(R.id.email_address);
		abcd_gmail_com = (TextView) findViewById(R.id.abcd_gmail_com);
		_bg__group_10_ek1 = (View) findViewById(R.id._bg__group_10_ek1);
		rectangle_1 = (View) findViewById(R.id.rectangle_1);
		send = (TextView) findViewById(R.id.send);
		reset_password = (TextView) findViewById(R.id.reset_password);
		_bg___eva_arrow_ios_back_fill_ek1 = (View) findViewById(R.id._bg___eva_arrow_ios_back_fill_ek1);
		vector = (ImageView) findViewById(R.id.vector);
		_home_indicator = (View) findViewById(R.id._home_indicator);
	
		
		_home_indicator.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), begin_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	