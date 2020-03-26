package com.dp.observer;

import com.dp.observer.observers.CurrentConditionsDisplay;
import com.dp.observer.subjects.WeatherData;

public class WeatherStation {

	public static void main(String[] args) {
		
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay cd = new CurrentConditionsDisplay(weatherData);
		
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 75, 20.9f);
		weatherData.setMeasurements(61, 95, 10.1f);
		
	}

}
