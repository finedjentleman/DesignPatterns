package com.dp.observer.subjects;

import com.dp.observer.observers.Observer;

public interface Subject {

	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
	
}
