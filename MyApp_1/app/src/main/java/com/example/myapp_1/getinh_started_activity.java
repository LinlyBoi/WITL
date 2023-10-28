
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		bxs_wallet
	 *	@date 		Saturday 28th of October 2023 06:22:49 AM
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
import android.content.Intent;
import android.widget.TextView;

public class getinh_started_activity extends Activity {

	
	private View _bg__getinh_started_ek2;
	private ImageView _image_4;
	private View _bg__iphone_status_bar_ek1;
	private ImageView wifi;
	private View _bg____battery_ek1;
	private ImageView fill;
	private ImageView outline;
	private ImageView reception;
	private TextView time;
	private ImageView rectangle_43;
	private View _home_indicator;
	private TextView alexandria_s_tram_prediction;
	private View _bg___group_15_ek1;
	private TextView skip;
	private ImageView vector;
	private View _bg__group_13_ek1;
	private View ellipse_12;
	private View ellipse_14;
	private View ellipse_13;
	private TextView this_app_will_provide_accurate_tram_arriving_time_at_selected_stations;
	private View _rectangle_8;
	private View _bg___group_12_ek1;
	private TextView get_started;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.getinh_started);

		
		_bg__getinh_started_ek2 = (View) findViewById(R.id._bg__getinh_started_ek2);
		_image_4 = (ImageView) findViewById(R.id._image_4);
		_bg__iphone_status_bar_ek1 = (View) findViewById(R.id._bg__iphone_status_bar_ek1);
		wifi = (ImageView) findViewById(R.id.wifi);
		_bg____battery_ek1 = (View) findViewById(R.id._bg____battery_ek1);
		fill = (ImageView) findViewById(R.id.fill);
		outline = (ImageView) findViewById(R.id.outline);
		reception = (ImageView) findViewById(R.id.reception);
		time = (TextView) findViewById(R.id.time);
		rectangle_43 = (ImageView) findViewById(R.id.rectangle_43);
		_home_indicator = (View) findViewById(R.id._home_indicator);
		alexandria_s_tram_prediction = (TextView) findViewById(R.id.alexandria_s_tram_prediction);
		_bg___group_15_ek1 = (View) findViewById(R.id._bg___group_15_ek1);
		skip = (TextView) findViewById(R.id.skip);
		vector = (ImageView) findViewById(R.id.vector);
		_bg__group_13_ek1 = (View) findViewById(R.id._bg__group_13_ek1);
		ellipse_12 = (View) findViewById(R.id.ellipse_12);
		ellipse_14 = (View) findViewById(R.id.ellipse_14);
		ellipse_13 = (View) findViewById(R.id.ellipse_13);
		this_app_will_provide_accurate_tram_arriving_time_at_selected_stations = (TextView) findViewById(R.id.this_app_will_provide_accurate_tram_arriving_time_at_selected_stations);
		_rectangle_8 = (View) findViewById(R.id._rectangle_8);
		_bg___group_12_ek1 = (View) findViewById(R.id._bg___group_12_ek1);
		get_started = (TextView) findViewById(R.id.get_started);
	
		
		_image_4.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), getinh_started_2_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_home_indicator.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), begin_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_rectangle_8.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), getinh_started_2_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	