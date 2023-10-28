
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		bxs_wallet
	 *	@date 		Saturday 28th of October 2023 06:26:26 AM
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

public class schedule_activity extends Activity {

	
	private View _bg__schedule_ek2;
	private View _bg__iphone_status_bar_ek1;
	private ImageView wifi;
	private View _bg____battery_ek1;
	private ImageView fill;
	private ImageView outline;
	private ImageView reception;
	private TextView time;
	private ImageView _vector;
	private TextView schedule_ek3;
	private View _home_indicator;
	private TextView start_station_;
	private TextView end_station_;
	private TextView start_time_;
	private TextView end_time_;
	private View rectangle_38;
	private View rectangle_40;
	private View rectangle_39;
	private ImageView vector_ek1;
	private ImageView vector_ek2;
	private ImageView vector_ek3;
	private View rectangle_41;
	private TextView date_;
	private View rectangle_42;
	private View _bg__group_23_ek1;
	private ImageView vector_ek4;
	private ImageView vector_ek5;
	private ImageView vector_ek6;
	private ImageView vector_ek7;
	private TextView dd__mm__yy;
	private View _bg__group_11_ek1;
	private View rectangle_8;
	private TextView search_train;
	private View _bg__group_ek1;
	private ImageView vector_ek8;
	private ImageView vector_ek9;
	private ImageView vector_ek10;
	private ImageView vector_ek11;
	private TextView __select_;
	private TextView __select__ek1;
	private TextView __select__ek2;
	private TextView __select__ek3;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.schedule);

		
		_bg__schedule_ek2 = (View) findViewById(R.id._bg__schedule_ek2);
		_bg__iphone_status_bar_ek1 = (View) findViewById(R.id._bg__iphone_status_bar_ek1);
		wifi = (ImageView) findViewById(R.id.wifi);
		_bg____battery_ek1 = (View) findViewById(R.id._bg____battery_ek1);
		fill = (ImageView) findViewById(R.id.fill);
		outline = (ImageView) findViewById(R.id.outline);
		reception = (ImageView) findViewById(R.id.reception);
		time = (TextView) findViewById(R.id.time);
		_vector = (ImageView) findViewById(R.id._vector);
		schedule_ek3 = (TextView) findViewById(R.id.schedule_ek3);
		_home_indicator = (View) findViewById(R.id._home_indicator);
		start_station_ = (TextView) findViewById(R.id.start_station_);
		end_station_ = (TextView) findViewById(R.id.end_station_);
		start_time_ = (TextView) findViewById(R.id.start_time_);
		end_time_ = (TextView) findViewById(R.id.end_time_);
		rectangle_38 = (View) findViewById(R.id.rectangle_38);
		rectangle_40 = (View) findViewById(R.id.rectangle_40);
		rectangle_39 = (View) findViewById(R.id.rectangle_39);
		vector_ek1 = (ImageView) findViewById(R.id.vector_ek1);
		vector_ek2 = (ImageView) findViewById(R.id.vector_ek2);
		vector_ek3 = (ImageView) findViewById(R.id.vector_ek3);
		rectangle_41 = (View) findViewById(R.id.rectangle_41);
		date_ = (TextView) findViewById(R.id.date_);
		rectangle_42 = (View) findViewById(R.id.rectangle_42);
		_bg__group_23_ek1 = (View) findViewById(R.id._bg__group_23_ek1);
		vector_ek4 = (ImageView) findViewById(R.id.vector_ek4);
		vector_ek5 = (ImageView) findViewById(R.id.vector_ek5);
		vector_ek6 = (ImageView) findViewById(R.id.vector_ek6);
		vector_ek7 = (ImageView) findViewById(R.id.vector_ek7);
		dd__mm__yy = (TextView) findViewById(R.id.dd__mm__yy);
		_bg__group_11_ek1 = (View) findViewById(R.id._bg__group_11_ek1);
		rectangle_8 = (View) findViewById(R.id.rectangle_8);
		search_train = (TextView) findViewById(R.id.search_train);
		_bg__group_ek1 = (View) findViewById(R.id._bg__group_ek1);
		vector_ek8 = (ImageView) findViewById(R.id.vector_ek8);
		vector_ek9 = (ImageView) findViewById(R.id.vector_ek9);
		vector_ek10 = (ImageView) findViewById(R.id.vector_ek10);
		vector_ek11 = (ImageView) findViewById(R.id.vector_ek11);
		__select_ = (TextView) findViewById(R.id.__select_);
		__select__ek1 = (TextView) findViewById(R.id.__select__ek1);
		__select__ek2 = (TextView) findViewById(R.id.__select__ek2);
		__select__ek3 = (TextView) findViewById(R.id.__select__ek3);
	
		
		_vector.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), home_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_home_indicator.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), begin_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	