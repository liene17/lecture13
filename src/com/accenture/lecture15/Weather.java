package com.accenture.lecture15;

import java.util.Arrays;

public class Weather {
	private final String country; // for which forecast is prepared.
	private int[] daysWeather; // temperature information for next week (7 days)

	public String getCountry() {
		return country;
	}

	public int[] getDaysWeather() {
		return daysWeather;
	}

	public Weather(String country, int[] daysWeather) {
		this.country = country;
		this.daysWeather = daysWeather;

	}

	// public String toString() {
	// String result = "";
	// for (int i = 0; i < daysWeather.length; i++) {
	// if (i < daysWeather.length - 1) {
	// result = result + daysWeather[i] + ", ";
	// } else {
	// result = result + daysWeather[i];
	//
	// }
	// }
	// return "Weather forecast in " + country + " for next days " + result;
	// }

	public String toString() {
		return "Weather forecast in " + getCountry() + " for next days "
				+ Arrays.toString(getDaysWeather());
		
	}
	public double getSum(){
		double sum = 0;
		for (int i = 0; i < daysWeather.length; i++) {
			sum = sum + daysWeather[i];
		}
		return sum; 
	}
	public double getWeekAverage(){
		double average = 0;
		average = getSum() / daysWeather.length;
		return average;
	}
	public int getHottestTemperature(){
		int highest = 0; 
		for (int i = 0; i < daysWeather.length; i++) {
			if (daysWeather[i] > highest) {
				highest = daysWeather[i];
			}
		}
		return highest;
	}
}
