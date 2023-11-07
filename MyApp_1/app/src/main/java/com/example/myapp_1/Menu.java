

	/*
     *	This content is generated from the API File Info.
     *	(Alt+Shift+Ctrl+I).
     *
     *	@desc
     *	@file 		begin
     *	@date 		Wednesday 01st of November 2023 05:44:03 PM
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


    import android.view.View;
    import android.widget.ImageView;
    import android.widget.TextView;

    public class Menu extends Activity {


        private View _bg__hamburger_menu_ek2;
        private View side_bar_white_frame;
        private View side_bar_blue_frame;
        private View _bg__side_bar_icon_ek1;
        private ImageView vector;
        private ImageView vector_ek1;
        private TextView name;
        private TextView trains;
        private TextView schedule;
        private TextView stations;
        private TextView app_version_1_0_0_0;
        private View _bg__home_station_ek1;
        private View station_icon_ellipse;
        private ImageView station_icon;
        private View _bg__home_notification_ek1;
        private View notification_icon_ellipse;
        private View _bg__notification_icon_ek1;
        private ImageView notification_icon_ek2;
        private View _bg__home_schedule_ek1;
        private View schedule_icon_ellipse;
        private View _bg__schedule_icon_ek1;
        private View _bg__schedule_group_ek1;
        private ImageView part6_cal;
        private ImageView part5_cal;
        private ImageView part4_cal;
        private ImageView part3_cal;
        private ImageView part2_cal;
        private ImageView part1_cal;
        private View _bg__home_train_ek1;
        private View train_icon_ellipse_;
        private View _bg__train_icon_ek1;
        private ImageView train_icon_ek2;
        private View _bg__home_trips_ek1;
        private View trip_icon_ellipse;
        private View _bg__trip_icon_ek1;
        private ImageView trip_icon_ek2;
        private TextView notification;
        private TextView trips;

        @Override
        public void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
            setContentView(R.layout.hamburger_menu);

            side_bar_blue_frame = (View) findViewById(R.id.side_bar_blue_frame);
            _bg__side_bar_icon_ek1 = (View) findViewById(R.id._bg__side_bar_icon_ek1);
            vector = (ImageView) findViewById(R.id.vector);
            vector_ek1 = (ImageView) findViewById(R.id.vector_ek1);
            name = (TextView) findViewById(R.id.name);
            schedule = (TextView) findViewById(R.id.schedule);
            app_version_1_0_0_0 = (TextView) findViewById(R.id.app_version_1_0_0_0);
            notification_icon_ellipse = (View) findViewById(R.id.notification_icon_ellipse);
            _bg__notification_icon_ek1 = (View) findViewById(R.id._bg__notification_icon_ek1);
            notification_icon_ek2 = (ImageView) findViewById(R.id.notification_icon_ek2);
            schedule_icon_ellipse = (View) findViewById(R.id.schedule_icon_ellipse);
            _bg__schedule_icon_ek1 = (View) findViewById(R.id._bg__schedule_icon_ek1);
            _bg__schedule_group_ek1 = (View) findViewById(R.id._bg__schedule_group_ek1);
            part6_cal = (ImageView) findViewById(R.id.part6_cal);
            part5_cal = (ImageView) findViewById(R.id.part5_cal);
            part4_cal = (ImageView) findViewById(R.id.part4_cal);
            part3_cal = (ImageView) findViewById(R.id.part3_cal);
            part2_cal = (ImageView) findViewById(R.id.part2_cal);
            part1_cal = (ImageView) findViewById(R.id.part1_cal);
            trip_icon_ellipse = (View) findViewById(R.id.trip_icon_ellipse);
            trip_icon_ek2 = (ImageView) findViewById(R.id.trip_icon_ek2);
            notification = (TextView) findViewById(R.id.notification);
            trips = (TextView) findViewById(R.id.trips);

            // ...
            notification_icon_ek2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Menu.this, notifications_activity.class);
                    startActivity(intent);
                }
            });

            part4_cal.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent newscreen = new Intent(Menu.this, schedule_activity.class);
                    startActivity(newscreen);
                }
            });

            trip_icon_ek2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Menu.this, trips.class);
                    startActivity(intent);
                }
            });
// ...

            //custom code goes here

        }
    }

