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

	public String printArray() {
		String result = "";
		for (int i = 0; i < daysWeather.length; i++) {
			if (i < daysWeather.length - 1) {
				result = result + daysWeather[i] + ", ";
			} else {
				result = result + daysWeather[i];

			}
		}
		return "Weather forecast in " + country + " for next days " + result;
	}

}
