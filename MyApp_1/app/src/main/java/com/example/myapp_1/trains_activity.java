
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		bxs_wallet
	 *	@date 		Saturday 28th of October 2023 06:24:42 AM
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

public class trains_activity extends Activity {

	
	private View _bg__trains_ek2;
	private ImageView rectangle_43;
	private View _home_indicator;
	private View _home_indicator_ek1;
	private View rectangle_38;
	private TextView victoria;
	private TextView sidi_gaber;
	private TextView from;
	private TextView to;
	private ImageView line_15;
	private View _bg__carbon_train_ek1;
	private ImageView vector;
	private TextView estimated_destination_time;
	private View rectangle_47;
	private View rectangle_48;
	private View rectangle_49;
	private View rectangle_50;
	private TextView sidi_gaber_ek1;
	private TextView arrival_in_31mins;
	private View _bg__fluent_people_queue_20_filled_ek1;
	private ImageView vector_ek1;
	private View ellipse_15;
	private View _bg___group_32_ek1;
	private View rectangle_46;
	private View _bg__carbon_train_ek3;
	private ImageView vector_ek2;
	private TextView arrival_time_;
	private TextView victoria_ek1;
	private TextView predicted_time;
	private View _bg__fluent_people_queue_20_filled_ek3;
	private ImageView vector_ek3;
	private View ellipse_14;
	private ImageView vector_ek4;
	private ImageView vector_ek5;
	private View _bg___eva_arrow_ios_back_fill_ek1;
	private ImageView vector_ek6;
	private ImageView rectangle;
	private View _bg__iphone_status_bar_ek1;
	private ImageView wifi;
	private View _bg____battery_ek1;
	private ImageView fill;
	private ImageView outline;
	private ImageView reception;
	private TextView time;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.trains);

		
		_bg__trains_ek2 = (View) findViewById(R.id._bg__trains_ek2);
		rectangle_43 = (ImageView) findViewById(R.id.rectangle_43);
		_home_indicator = (View) findViewById(R.id._home_indicator);
		_home_indicator_ek1 = (View) findViewById(R.id._home_indicator_ek1);
		rectangle_38 = (View) findViewById(R.id.rectangle_38);
		victoria = (TextView) findViewById(R.id.victoria);
		sidi_gaber = (TextView) findViewById(R.id.sidi_gaber);
		from = (TextView) findViewById(R.id.from);
		to = (TextView) findViewById(R.id.to);
		line_15 = (ImageView) findViewById(R.id.line_15);
		_bg__carbon_train_ek1 = (View) findViewById(R.id._bg__carbon_train_ek1);
		vector = (ImageView) findViewById(R.id.vector);
		estimated_destination_time = (TextView) findViewById(R.id.estimated_destination_time);
		rectangle_47 = (View) findViewById(R.id.rectangle_47);
		rectangle_48 = (View) findViewById(R.id.rectangle_48);
		rectangle_49 = (View) findViewById(R.id.rectangle_49);
		rectangle_50 = (View) findViewById(R.id.rectangle_50);
		sidi_gaber_ek1 = (TextView) findViewById(R.id.sidi_gaber_ek1);
		arrival_in_31mins = (TextView) findViewById(R.id.arrival_in_31mins);
		_bg__fluent_people_queue_20_filled_ek1 = (View) findViewById(R.id._bg__fluent_people_queue_20_filled_ek1);
		vector_ek1 = (ImageView) findViewById(R.id.vector_ek1);
		ellipse_15 = (View) findViewById(R.id.ellipse_15);
		_bg___group_32_ek1 = (View) findViewById(R.id._bg___group_32_ek1);
		rectangle_46 = (View) findViewById(R.id.rectangle_46);
		_bg__carbon_train_ek3 = (View) findViewById(R.id._bg__carbon_train_ek3);
		vector_ek2 = (ImageView) findViewById(R.id.vector_ek2);
		arrival_time_ = (TextView) findViewById(R.id.arrival_time_);
		victoria_ek1 = (TextView) findViewById(R.id.victoria_ek1);
		predicted_time = (TextView) findViewById(R.id.predicted_time);
		_bg__fluent_people_queue_20_filled_ek3 = (View) findViewById(R.id._bg__fluent_people_queue_20_filled_ek3);
		vector_ek3 = (ImageView) findViewById(R.id.vector_ek3);
		ellipse_14 = (View) findViewById(R.id.ellipse_14);
		vector_ek4 = (ImageView) findViewById(R.id.vector_ek4);
		vector_ek5 = (ImageView) findViewById(R.id.vector_ek5);
		_bg___eva_arrow_ios_back_fill_ek1 = (View) findViewById(R.id._bg___eva_arrow_ios_back_fill_ek1);
		vector_ek6 = (ImageView) findViewById(R.id.vector_ek6);
		rectangle = (ImageView) findViewById(R.id.rectangle);
		_bg__iphone_status_bar_ek1 = (View) findViewById(R.id._bg__iphone_status_bar_ek1);
		wifi = (ImageView) findViewById(R.id.wifi);
		_bg____battery_ek1 = (View) findViewById(R.id._bg____battery_ek1);
		fill = (ImageView) findViewById(R.id.fill);
		outline = (ImageView) findViewById(R.id.outline);
		reception = (ImageView) findViewById(R.id.reception);
		time = (TextView) findViewById(R.id.time);
	
		
		_home_indicator.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), begin_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_home_indicator_ek1.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), begin_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	