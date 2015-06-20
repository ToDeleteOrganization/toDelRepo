package com.test.dp.observer;

public interface CustomSubject<T extends CustomObserver<?>> {

	public void addCustomObserver(T subj);
	
	public void notifyObservers(CustomEvent event);
}
