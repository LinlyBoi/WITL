
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		bxs_wallet
	 *	@date 		Saturday 28th of October 2023 06:28:32 AM
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
import android.widget.TextView;
import android.content.Intent;
import android.widget.ImageView;

public class stations_activity extends Activity {

	
	private View _bg__stations_ek2;
	private View _bg__frame_3_ek1;
	private View rectangle_51;
	private TextView _abanpola;
	private TextView agbopura;
	private TextView ahungalle;
	private TextView akurala;
	private TextView alawwa;
	private TextView alawathupitiya;
	private TextView aluthgama;
	private TextView ambalangoda;
	private TextView ambepussa;
	private TextView aluthgama_ek1;
	private TextView badulla;
	private TextView balapitiya;
	private TextView babarenda;
	private TextView bambalapitiya;
	private TextView bandarawela;
	private TextView bangadeniya;
	private TextView batticaloa;
	private TextView batuwatta;
	private TextView chavakachcheri;
	private TextView _colombo_fort;
	private TextView a;
	private TextView b;
	private TextView c;
	private View _home_indicator;
	private View rectangle_52;
	private TextView _stations_ek3;
	private ImageView _vector;
	private View _bg__iphone_status_bar_ek1;
	private ImageView wifi;
	private View _bg____battery_ek1;
	private ImageView fill;
	private ImageView outline;
	private ImageView reception;
	private TextView time;
	private View _bg__group_31_ek1;
	private View rectangle_40;
	private TextView search___;
	private View _bg__fe_search_ek1;
	private ImageView vector_ek1;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.stations);

		
		_bg__stations_ek2 = (View) findViewById(R.id._bg__stations_ek2);
		_bg__frame_3_ek1 = (View) findViewById(R.id._bg__frame_3_ek1);
		rectangle_51 = (View) findViewById(R.id.rectangle_51);
		_abanpola = (TextView) findViewById(R.id._abanpola);
		agbopura = (TextView) findViewById(R.id.agbopura);
		ahungalle = (TextView) findViewById(R.id.ahungalle);
		akurala = (TextView) findViewById(R.id.akurala);
		alawwa = (TextView) findViewById(R.id.alawwa);
		alawathupitiya = (TextView) findViewById(R.id.alawathupitiya);
		aluthgama = (TextView) findViewById(R.id.aluthgama);
		ambalangoda = (TextView) findViewById(R.id.ambalangoda);
		ambepussa = (TextView) findViewById(R.id.ambepussa);
		aluthgama_ek1 = (TextView) findViewById(R.id.aluthgama_ek1);
		badulla = (TextView) findViewById(R.id.badulla);
		balapitiya = (TextView) findViewById(R.id.balapitiya);
		babarenda = (TextView) findViewById(R.id.babarenda);
		bambalapitiya = (TextView) findViewById(R.id.bambalapitiya);
		bandarawela = (TextView) findViewById(R.id.bandarawela);
		bangadeniya = (TextView) findViewById(R.id.bangadeniya);
		batticaloa = (TextView) findViewById(R.id.batticaloa);
		batuwatta = (TextView) findViewById(R.id.batuwatta);
		chavakachcheri = (TextView) findViewById(R.id.chavakachcheri);
		_colombo_fort = (TextView) findViewById(R.id._colombo_fort);
		a = (TextView) findViewById(R.id.a);
		b = (TextView) findViewById(R.id.b);
		c = (TextView) findViewById(R.id.c);
		_home_indicator = (View) findViewById(R.id._home_indicator);
		rectangle_52 = (View) findViewById(R.id.rectangle_52);
		_stations_ek3 = (TextView) findViewById(R.id._stations_ek3);
		_vector = (ImageView) findViewById(R.id._vector);
		_bg__iphone_status_bar_ek1 = (View) findViewById(R.id._bg__iphone_status_bar_ek1);
		wifi = (ImageView) findViewById(R.id.wifi);
		_bg____battery_ek1 = (View) findViewById(R.id._bg____battery_ek1);
		fill = (ImageView) findViewById(R.id.fill);
		outline = (ImageView) findViewById(R.id.outline);
		reception = (ImageView) findViewById(R.id.reception);
		time = (TextView) findViewById(R.id.time);
		_bg__group_31_ek1 = (View) findViewById(R.id._bg__group_31_ek1);
		rectangle_40 = (View) findViewById(R.id.rectangle_40);
		search___ = (TextView) findViewById(R.id.search___);
		_bg__fe_search_ek1 = (View) findViewById(R.id._bg__fe_search_ek1);
		vector_ek1 = (ImageView) findViewById(R.id.vector_ek1);
	
		
		_abanpola.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), station_details_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_colombo_fort.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), station_details_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_home_indicator.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), begin_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_stations_ek3.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), home_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_vector.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), home_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	