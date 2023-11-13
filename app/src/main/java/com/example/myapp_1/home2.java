

	/*
     *	This content is generated from the API File Info.
     *	(Alt+Shift+Ctrl+I).
     *
     *	@desc
     *	@file 		begin
     *	@date 		Wednesday 01st of November 2023 06:23:03 PM
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

    import com.example.myapp_1.Menu;

    public class home2 extends Activity {


        private View _bg__choose_ek2;
        private ImageView train_image;
        private View _bg__menu_ek1;
        private ImageView menu_vector_3;
        private ImageView menu_vector_2;
        private ImageView menu_vector_1;
        private TextView good_evening___;
        private View _bg__arrival_group_ek1;
        private View _bg__arrival_carton_ek1;
        private ImageView arrval_bus_icon;
        private TextView arrival_time_;
        private TextView victoria;
        private TextView predicted_time;
        private View _bg__arrival_carton_ek3;
        private ImageView arrival_carton_icon;
        private View arrival_vector_ellipse;
        private ImageView arrival_vector;

        @Override
        public void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_home3);


            _bg__choose_ek2 = (View) findViewById(R.id._bg__choose_ek2);
            train_image = (ImageView) findViewById(R.id.train_image);
            _bg__menu_ek1 = (View) findViewById(R.id._bg__menu_ek1);
            menu_vector_3 = (ImageView) findViewById(R.id.menu_vector_3);
            menu_vector_2 = (ImageView) findViewById(R.id.menu_vector_2);
            menu_vector_1 = (ImageView) findViewById(R.id.menu_vector_1);
            good_evening___ = (TextView) findViewById(R.id.good_evening___);
            _bg__arrival_group_ek1 = (View) findViewById(R.id._bg__arrival_group_ek1);
            _bg__arrival_carton_ek1 = (View) findViewById(R.id._bg__arrival_carton_ek1);
            arrval_bus_icon = (ImageView) findViewById(R.id.arrval_bus_icon);
            arrival_time_ = (TextView) findViewById(R.id.arrival_time_);
            victoria = (TextView) findViewById(R.id.victoria);
            predicted_time = (TextView) findViewById(R.id.predicted_time);
            _bg__arrival_carton_ek3 = (View) findViewById(R.id._bg__arrival_carton_ek3);
            arrival_carton_icon = (ImageView) findViewById(R.id.arrival_carton_icon);
            arrival_vector_ellipse = (View) findViewById(R.id.arrival_vector_ellipse);
            arrival_vector = (ImageView) findViewById(R.id.arrival_vector);

            _bg__menu_ek1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(home2.this, Menu.class);
                    startActivity(intent);
                }
            });
            //custom code goes here

        }
    }

