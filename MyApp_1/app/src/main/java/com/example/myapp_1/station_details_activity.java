
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		bxs_wallet
	 *	@date 		Saturday 28th of October 2023 06:27:35 AM
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
import android.content.Intent;
import android.widget.ImageView;
import android.widget.TextView;

public class station_details_activity extends Activity {

	
	private View _bg__station_details_ek2;
	private View _bg__akar_icons_share_box_ek1;
	private View _home_indicator;
	private View _bg__frame_4_ek1;
	private ImageView image_13;
	private ImageView image_14;
	private ImageView image_15;
	private ImageView image_16;
	private ImageView image_17;
	private View _bg__mi_options_vertical_ek1;
	private ImageView vector;
	private ImageView _vector_ek1;
	private ImageView rectangle_43;
	private TextView fort_railway_station;
	private TextView fort_railway_station_is_a_major_rail_hub_in_colombo__sri_lanka__the_station_is_served_by_sri_lanka_railways__with_many_inter_city_and_commuter_trains_entering_each_day__fort_station_is_the_main_rail_gateway_to_central_colombo__it_is_the_terminus_of_most_intercity_trains_in_the_country_;
	private TextView address_;
	private TextView head_of_the_organization_;
	private TextView general_information;
	private TextView hours_;
	private TextView phone_;
	private TextView fax_nos__;
	private TextView telephones__;
	private TextView email_;
	private TextView colombo;
	private TextView mr__jayasundara;
	private TextView __94_11_2_446490;
	private TextView __94_11_4_600_111;
	private TextView gmr_railway_gov_lk;
	private TextView open___24_hours;
	private TextView _011_2434215;
	private ImageView vector_ek2;
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
		setContentView(R.layout.station_details);

		
		_bg__station_details_ek2 = (View) findViewById(R.id._bg__station_details_ek2);
		_bg__akar_icons_share_box_ek1 = (View) findViewById(R.id._bg__akar_icons_share_box_ek1);
		_home_indicator = (View) findViewById(R.id._home_indicator);
		_bg__frame_4_ek1 = (View) findViewById(R.id._bg__frame_4_ek1);
		image_13 = (ImageView) findViewById(R.id.image_13);
		image_14 = (ImageView) findViewById(R.id.image_14);
		image_15 = (ImageView) findViewById(R.id.image_15);
		image_16 = (ImageView) findViewById(R.id.image_16);
		image_17 = (ImageView) findViewById(R.id.image_17);
		_bg__mi_options_vertical_ek1 = (View) findViewById(R.id._bg__mi_options_vertical_ek1);
		vector = (ImageView) findViewById(R.id.vector);
		_vector_ek1 = (ImageView) findViewById(R.id._vector_ek1);
		rectangle_43 = (ImageView) findViewById(R.id.rectangle_43);
		fort_railway_station = (TextView) findViewById(R.id.fort_railway_station);
		fort_railway_station_is_a_major_rail_hub_in_colombo__sri_lanka__the_station_is_served_by_sri_lanka_railways__with_many_inter_city_and_commuter_trains_entering_each_day__fort_station_is_the_main_rail_gateway_to_central_colombo__it_is_the_terminus_of_most_intercity_trains_in_the_country_ = (TextView) findViewById(R.id.fort_railway_station_is_a_major_rail_hub_in_colombo__sri_lanka__the_station_is_served_by_sri_lanka_railways__with_many_inter_city_and_commuter_trains_entering_each_day__fort_station_is_the_main_rail_gateway_to_central_colombo__it_is_the_terminus_of_most_intercity_trains_in_the_country_);
		address_ = (TextView) findViewById(R.id.address_);
		head_of_the_organization_ = (TextView) findViewById(R.id.head_of_the_organization_);
		general_information = (TextView) findViewById(R.id.general_information);
		hours_ = (TextView) findViewById(R.id.hours_);
		phone_ = (TextView) findViewById(R.id.phone_);
		fax_nos__ = (TextView) findViewById(R.id.fax_nos__);
		telephones__ = (TextView) findViewById(R.id.telephones__);
		email_ = (TextView) findViewById(R.id.email_);
		colombo = (TextView) findViewById(R.id.colombo);
		mr__jayasundara = (TextView) findViewById(R.id.mr__jayasundara);
		__94_11_2_446490 = (TextView) findViewById(R.id.__94_11_2_446490);
		__94_11_4_600_111 = (TextView) findViewById(R.id.__94_11_4_600_111);
		gmr_railway_gov_lk = (TextView) findViewById(R.id.gmr_railway_gov_lk);
		open___24_hours = (TextView) findViewById(R.id.open___24_hours);
		_011_2434215 = (TextView) findViewById(R.id._011_2434215);
		vector_ek2 = (ImageView) findViewById(R.id.vector_ek2);
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
		
		
		_vector_ek1.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), stations_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	