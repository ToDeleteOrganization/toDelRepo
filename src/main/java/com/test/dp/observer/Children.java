package com.test.dp.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Children implements CustomSubject<Parent> {

	public final List<Parent> parents = new ArrayList<Parent>();
	
	protected String childName;
	
	public abstract void whatDidYouDoKid(CustomEvent event);

	public Children(String nm) {
		this.childName = nm;
	}

	public String getChildName() {
		return childName;
	}

	public void notifyObservers(CustomEvent event) {
		for (Parent p : parents) {
			p.customNotification(this, event);
		}
	}
}
