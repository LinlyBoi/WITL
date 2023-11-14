
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		begin
	 *	@date 		Friday 27th of October 2023 05:58:49 PM
	 *	@title 		Page 1
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
	

package com.example.myapp_1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;


	public class begin_activity extends AppCompatActivity {

		private static final int SPLASH_DURATION = 3000; // 3 seconds

		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.begin);

			new Handler().postDelayed(new Runnable() {
				@Override
				public void run() {
					// Start the main activity after the splash duration
					Intent intent = new Intent(begin_activity.this, getinh_started_activity.class);
					startActivity(intent);
					finish(); // Close the splash screen activity
				}
			}, SPLASH_DURATION);
		}
	}
	
	