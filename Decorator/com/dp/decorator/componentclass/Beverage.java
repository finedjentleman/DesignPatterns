package com.dp.decorator.componentclass;

public abstract class Beverage {

	String description = "Unknown Beverage";
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
	
}
