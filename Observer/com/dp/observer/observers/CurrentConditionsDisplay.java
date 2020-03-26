package com.dp.observer.observers;

import com.dp.observer.subjects.Subject;

public class CurrentConditionsDisplay implements DisplayElement, Observer {

	private float temp;
	private float humidity;
	private Subject weatherData;
	
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	public void update(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		display();
	}
	
	public void display() {
		System.out.println("Current conditions: " + temp + " degrees, " + 
				humidity + " percent humidity");
	}
	
}
