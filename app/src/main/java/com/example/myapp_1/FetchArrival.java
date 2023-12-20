package com.example.myapp_1;


import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import com.example.myapp_1.DB.GetArrivals;
import com.example.myapp_1.DB.RetrofitClient;

import retrofit2.Retrofit;

public class FetchArrival extends Service
{
	private GetArrivals apiService = RetrofitClient.getRetrofitInstance().create(GetArrivals.class);

	@Override
	public int onStartCommand(Intent intent, int flags, int Startid) {

		return START_NOT_STICKY;
	}
	@Override
	public IBinder onBind(Intent intent)
	{
		// TODO: Return the communication channel to the service.
		throw new UnsupportedOperationException("Not yet implemented");
	}
}