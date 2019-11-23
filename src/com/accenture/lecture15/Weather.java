package com.accenture.lecture15;

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

	public static void main(String[] args) {

	}

}
