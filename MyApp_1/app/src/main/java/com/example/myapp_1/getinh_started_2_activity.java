
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		bxs_wallet
	 *	@date 		Saturday 28th of October 2023 06:23:55 AM
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

public class getinh_started_2_activity extends Activity {

	
	private View _bg__getinh_started_2_ek2;
	private ImageView image_4;
	private View _bg__iphone_status_bar_ek1;
	private ImageView wifi;
	private View _bg____battery_ek1;
	private ImageView fill;
	private ImageView outline;
	private ImageView reception;
	private TextView time;
	private ImageView rectangle_43;
	private View _home_indicator;
	private TextView find_your_trains_easily_and_buy_tickets_online_;
	private View _rectangle_8;
	private View _bg___group_12_ek1;
	private TextView next;
	private TextView find_your_train_easily;
	private View _bg___group_16_ek1;
	private TextView skip;
	private ImageView vector;
	private View _bg__group_13_ek1;
	private View ellipse_12;
	private View ellipse_14;
	private View ellipse_13;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.getinh_started_2);

		
		_bg__getinh_started_2_ek2 = (View) findViewById(R.id._bg__getinh_started_2_ek2);
		image_4 = (ImageView) findViewById(R.id.image_4);
		_bg__iphone_status_bar_ek1 = (View) findViewById(R.id._bg__iphone_status_bar_ek1);
		wifi = (ImageView) findViewById(R.id.wifi);
		_bg____battery_ek1 = (View) findViewById(R.id._bg____battery_ek1);
		fill = (ImageView) findViewById(R.id.fill);
		outline = (ImageView) findViewById(R.id.outline);
		reception = (ImageView) findViewById(R.id.reception);
		time = (TextView) findViewById(R.id.time);
		rectangle_43 = (ImageView) findViewById(R.id.rectangle_43);
		_home_indicator = (View) findViewById(R.id._home_indicator);
		find_your_trains_easily_and_buy_tickets_online_ = (TextView) findViewById(R.id.find_your_trains_easily_and_buy_tickets_online_);
		_rectangle_8 = (View) findViewById(R.id._rectangle_8);
		_bg___group_12_ek1 = (View) findViewById(R.id._bg___group_12_ek1);
		next = (TextView) findViewById(R.id.next);
		find_your_train_easily = (TextView) findViewById(R.id.find_your_train_easily);
		_bg___group_16_ek1 = (View) findViewById(R.id._bg___group_16_ek1);
		skip = (TextView) findViewById(R.id.skip);
		vector = (ImageView) findViewById(R.id.vector);
		_bg__group_13_ek1 = (View) findViewById(R.id._bg__group_13_ek1);
		ellipse_12 = (View) findViewById(R.id.ellipse_12);
		ellipse_14 = (View) findViewById(R.id.ellipse_14);
		ellipse_13 = (View) findViewById(R.id.ellipse_13);
	
		
		_home_indicator.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), begin_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_rectangle_8.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), home_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	