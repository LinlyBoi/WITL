package com.example.myapp_1;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class trips extends Activity {


    private View _bg___trips_ek2;
    private ImageView header;
    private View _bg__trip_parta_ek1;
    private View tripa;
    private View _bg__trip_frame_a_icon_location_ek1;
    private ImageView location;
    private TextView hurstbridge_line;
    private TextView _12_15_pm___1_19_pm;
    private TextView _1_hr_4_min;
    private TextView from_victoria;
    private View _bg__trip_frame_a_icon_ek1;
    private ImageView vector;
    private TextView to_melbourne_central_station;
    private View _bg__trip_frame_a_icon_ek3;
    private ImageView vector_ek1;
    private View _bg__trip_parta_ek3;
    private View tripa_ek1;
    private View _bg__trip_frame_a_icon_location_ek3;
    private ImageView location_ek1;
    private TextView hurstbridge_line_ek1;
    private TextView _12_15_pm___1_19_pm_ek1;
    private TextView _1_hr_4_min_ek1;
    private TextView from_victoria_ek1;
    private View _bg__trip_frame_a_icon_ek5;
    private ImageView vector_ek2;
    private TextView to_melbourne_central_station_ek1;
    private View _bg__trip_frame_a_icon_ek7;
    private ImageView vector_ek3;
    private View _bg__trip_filter_ek1;
    private View _bg__trip_sort_button_ek1;
    private View _bg__trip_sort_frame_ek1;
    private ImageView trip_sort_vector;
    private View _bg__trip_parta_ek5;
    private View tripa_ek2;
    private View _bg__trip_frame_a_icon_location_ek5;
    private ImageView location_ek2;
    private TextView hurstbridge_line_ek2;
    private TextView _12_15_pm___1_19_pm_ek2;
    private TextView _1_hr_4_min_ek2;
    private TextView from_victoria_ek2;
    private View _bg__trip_frame_a_icon_ek9;
    private ImageView vector_ek4;
    private TextView to_melbourne_central_station_ek2;
    private View _bg__trip_frame_a_icon_ek11;
    private ImageView vector_ek5;
    private View _bg__trip_parta_ek7;
    private View tripa_ek3;
    private View _bg__trip_frame_a_icon_location_ek7;
    private ImageView location_ek3;
    private TextView hurstbridge_line_ek3;
    private TextView _12_15_pm___1_19_pm_ek3;
    private TextView _1_hr_4_min_ek3;
    private TextView from_victoria_ek3;
    private View _bg__trip_frame_a_icon_ek13;
    private ImageView vector_ek6;
    private TextView to_melbourne_central_station_ek3;
    private View _bg__trip_frame_a_icon_ek15;
    private ImageView vector_ek7;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.trips);

        _bg___trips_ek2 = (View) findViewById(R.id._bg___trips_ek2);
        header = (ImageView) findViewById(R.id.header);
        _bg__trip_parta_ek1 = (View) findViewById(R.id._bg__trip_parta_ek1);
        tripa = (View) findViewById(R.id.tripa);
        _bg__trip_frame_a_icon_location_ek1 = (View) findViewById(R.id._bg__trip_frame_a_icon_location_ek1);
        location = (ImageView) findViewById(R.id.location);
        hurstbridge_line = (TextView) findViewById(R.id.hurstbridge_line);
        _12_15_pm___1_19_pm = (TextView) findViewById(R.id._12_15_pm___1_19_pm);
        _1_hr_4_min = (TextView) findViewById(R.id._1_hr_4_min);
        from_victoria = (TextView) findViewById(R.id.from_victoria);
        _bg__trip_frame_a_icon_ek1 = (View) findViewById(R.id._bg__trip_frame_a_icon_ek1);
        vector = (ImageView) findViewById(R.id.vector);
        to_melbourne_central_station = (TextView) findViewById(R.id.to_melbourne_central_station);
        _bg__trip_frame_a_icon_ek3 = (View) findViewById(R.id._bg__trip_frame_a_icon_ek3);
        vector_ek1 = (ImageView) findViewById(R.id.vector_ek1);
        _bg__trip_parta_ek3 = (View) findViewById(R.id._bg__trip_parta_ek3);
        tripa_ek1 = (View) findViewById(R.id.tripa_ek1);
        _bg__trip_frame_a_icon_location_ek3 = (View) findViewById(R.id._bg__trip_frame_a_icon_location_ek3);
        location_ek1 = (ImageView) findViewById(R.id.location_ek1);
        hurstbridge_line_ek1 = (TextView) findViewById(R.id.hurstbridge_line_ek1);
        _12_15_pm___1_19_pm_ek1 = (TextView) findViewById(R.id._12_15_pm___1_19_pm_ek1);
        _1_hr_4_min_ek1 = (TextView) findViewById(R.id._1_hr_4_min_ek1);
        from_victoria_ek1 = (TextView) findViewById(R.id.from_victoria_ek1);
        _bg__trip_frame_a_icon_ek5 = (View) findViewById(R.id._bg__trip_frame_a_icon_ek5);
        vector_ek2 = (ImageView) findViewById(R.id.vector_ek2);
        to_melbourne_central_station_ek1 = (TextView) findViewById(R.id.to_melbourne_central_station_ek1);
        _bg__trip_frame_a_icon_ek7 = (View) findViewById(R.id._bg__trip_frame_a_icon_ek7);
        vector_ek3 = (ImageView) findViewById(R.id.vector_ek3);
        _bg__trip_filter_ek1 = (View) findViewById(R.id._bg__trip_filter_ek1);
        _bg__trip_sort_button_ek1 = (View) findViewById(R.id._bg__trip_sort_button_ek1);
        _bg__trip_sort_frame_ek1 = (View) findViewById(R.id._bg__trip_sort_frame_ek1);
        trip_sort_vector = (ImageView) findViewById(R.id.trip_sort_vector);
        _bg__trip_parta_ek5 = (View) findViewById(R.id._bg__trip_parta_ek5);
        tripa_ek2 = (View) findViewById(R.id.tripa_ek2);
        _bg__trip_frame_a_icon_location_ek5 = (View) findViewById(R.id._bg__trip_frame_a_icon_location_ek5);
        location_ek2 = (ImageView) findViewById(R.id.location_ek2);
        hurstbridge_line_ek2 = (TextView) findViewById(R.id.hurstbridge_line_ek2);
        _12_15_pm___1_19_pm_ek2 = (TextView) findViewById(R.id._12_15_pm___1_19_pm_ek2);
        _1_hr_4_min_ek2 = (TextView) findViewById(R.id._1_hr_4_min_ek2);
        from_victoria_ek2 = (TextView) findViewById(R.id.from_victoria_ek2);
        _bg__trip_frame_a_icon_ek9 = (View) findViewById(R.id._bg__trip_frame_a_icon_ek9);
        vector_ek4 = (ImageView) findViewById(R.id.vector_ek4);
        to_melbourne_central_station_ek2 = (TextView) findViewById(R.id.to_melbourne_central_station_ek2);
        _bg__trip_frame_a_icon_ek11 = (View) findViewById(R.id._bg__trip_frame_a_icon_ek11);
        vector_ek5 = (ImageView) findViewById(R.id.vector_ek5);
        _bg__trip_parta_ek7 = (View) findViewById(R.id._bg__trip_parta_ek7);
        tripa_ek3 = (View) findViewById(R.id.tripa_ek3);
        _bg__trip_frame_a_icon_location_ek7 = (View) findViewById(R.id._bg__trip_frame_a_icon_location_ek7);
        location_ek3 = (ImageView) findViewById(R.id.location_ek3);
        hurstbridge_line_ek3 = (TextView) findViewById(R.id.hurstbridge_line_ek3);
        _12_15_pm___1_19_pm_ek3 = (TextView) findViewById(R.id._12_15_pm___1_19_pm_ek3);
        _1_hr_4_min_ek3 = (TextView) findViewById(R.id._1_hr_4_min_ek3);
        from_victoria_ek3 = (TextView) findViewById(R.id.from_victoria_ek3);
        _bg__trip_frame_a_icon_ek13 = (View) findViewById(R.id._bg__trip_frame_a_icon_ek13);
        vector_ek6 = (ImageView) findViewById(R.id.vector_ek6);
        to_melbourne_central_station_ek3 = (TextView) findViewById(R.id.to_melbourne_central_station_ek3);
        _bg__trip_frame_a_icon_ek15 = (View) findViewById(R.id._bg__trip_frame_a_icon_ek15);
        vector_ek7 = (ImageView) findViewById(R.id.vector_ek7);


        header.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(trips.this, home2.class);
                startActivity(intent);
            }
        });

    }
}

