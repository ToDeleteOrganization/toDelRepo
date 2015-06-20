package com.test.dp.observer;

public class GirlChild extends Children {

	public GirlChild(String nm) {
		super(nm);
	}

	public void addCustomObserver(Parent subj) {
		this.parents.add(subj);
	}

	public void whatDidYouDoKid(CustomEvent event) {
		if (event.isItGood()) {
			notifyObservers(event);

		} else if (event.isItBad()) {
			System.out.println("I am sorry, please don't tell my parents");

		} else if (event.isItVeryBad()) {
			System.out.println(":((");
			notifyObservers(event);

		} else {
			System.out.println("I did nothing, not a single thing.");
		}
	}

}
