package com.test.dp.observer;

public class Mother extends Parent {

	public void customNotification(Children custSubj, CustomEvent event) {
		System.out.println("Mother notification on: " + custSubj.getChildName());
		System.out.println("he/she did: " + event.getEventName());
	}

	public void watchOver(Children child) {
		this.observedChildren.add(child);
		child.addCustomObserver(this);
	}

}
