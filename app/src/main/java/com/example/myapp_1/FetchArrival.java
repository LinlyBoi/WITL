package com.example.myapp_1;


import android.app.Service;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

import com.example.myapp_1.DB.Arrival;
import com.example.myapp_1.DB.GetArrivals;
import com.example.myapp_1.DB.RetrofitClient;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class FetchArrival extends Service
{
	private static final String TAG = "MyActivity";
	@Override
	public int onStartCommand(Intent intent, int flags, int Startid) {
		GetArrivals apiService = RetrofitClient.getRetrofitInstance().create(GetArrivals.class);
		Call<List<Arrival>> call = apiService.getAllArrivals();
		//Execute the request asynchronously//

		call.enqueue(new Callback<List<Arrival>>() {



			//Handle a successful response//
			@Override
			public void onResponse(Call<List<Arrival>> call, Response<List<Arrival>> response) {
				SharedPreferences sp = getApplicationContext().getSharedPreferences("UserData", MODE_PRIVATE);
				SharedPreferences.Editor editor = sp.edit();
//				Log.d(TAG, response.body().toString());
				editor.putString("response", response.body().toString());
				editor.apply();
			}
			//Handle execution failures//

			public void onFailure(Call<List<Arrival>> call, Throwable throwable) {
				System.out.println("A");
			}
		});


//Display the retrieved data as a list//



		return START_NOT_STICKY;
	}
	@Override
	public IBinder onBind(Intent intent)
	{
		// TODO: Return the communication channel to the service.
		throw new UnsupportedOperationException("Not yet implemented");
	}
}