package com.example.myapp_1.DB;

public class Arrival
{
	public String getArrivalTime()
	{
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime)
	{
		this.arrivalTime = arrivalTime;
	}

	private String arrivalTime;
	Arrival(String time) {
		this.arrivalTime = time;

	}
}
