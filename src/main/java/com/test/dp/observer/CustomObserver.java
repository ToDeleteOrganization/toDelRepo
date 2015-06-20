package com.test.dp.observer;

public interface CustomObserver<T extends CustomSubject<?>> {
	
	public void customNotification(T custSubj, CustomEvent event);
}
