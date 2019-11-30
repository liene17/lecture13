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

	public double getSum() {
		double sum = 0;
		for (int i = 0; i < daysWeather.length; i++) {
			sum = sum + daysWeather[i];
		}
		return sum;
	}

	public double getWeekAverage() {
		double average = 0;
		average = getSum() / daysWeather.length;
		return average;
	}

	public int getHottestTemperature() {
		int highest = 0;
		for (int i = 0; i < daysWeather.length; i++) {
			if (daysWeather[i] > highest) {
				highest = daysWeather[i];
			}
		}
		return highest;
	}

	public String getHottestDayName() {
		String dayName = getDayNameFromIndex(getHottestTemperatureIndex());

		return dayName;

	}

	private int getHottestTemperatureIndex() {
		int highest = 0;
		int index = 0;
		for (int i = 0; i < daysWeather.length; i++) {
			if (daysWeather[i] > highest) {
				highest = daysWeather[i];
				index = i;
			}
		}
		return index;
	}

	public int getColdestTemperature() {
		int lowest = 0;
		for (int i = 0; i < daysWeather.length; i++) {
			if (daysWeather[i] < lowest) {
				lowest = daysWeather[i];
			}
		}
		return lowest;
	}

	private int getColdestTemperatureIndex() {
		int lowest = 0;
		int index = 0;
		for (int i = 0; i < daysWeather.length; i++) {
			if (daysWeather[i] < lowest) {
				lowest = daysWeather[i];
				index = i;
			}
		}
		return index;
	}

	public String getColdestDayName() {
		String dayName = getDayNameFromIndex(getColdestTemperatureIndex());

		return dayName;

	}

	public String getDayNameFromIndex(int index) {
		// int index = getColdestTemperatureIndex();
		String dayName = " ";

		switch (index) {
		case 0:
			dayName = "Monday";
			break;
		case 1:
			dayName = "Tuesday";
			break;
		case 2:
			dayName = "Wednesday";
			break;
		case 3:
			dayName = "Thursday";
			break;
		case 4:
			dayName = "Friday";
			break;
		case 5:
			dayName = "Saturday";
			break;
		case 6:
			dayName = "Sunday";
			break;
		default:
			dayName = "Invalid day";
			break;
		}

		return dayName;

	}

	public void printAdvancedInformation() {
		System.out.println("In " + country
				+ " during next 7 day will be following weather: "
				+ Arrays.toString(getDaysWeather())
				+ ", the highest temp will be on " + getHottestDayName() + " +"
				+ getHottestTemperature()
				+ " degree, the lowest temp will be on " + getColdestDayName()
				+ " " + getColdestTemperature() + " degree");
	}

	public void applyWarmCycloneEffect() {
		int i;
		for (i = 0; i < daysWeather.length; i++) {
			daysWeather[i] = daysWeather[i] + 1;
		}

	}
}
