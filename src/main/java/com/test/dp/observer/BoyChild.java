package com.test.dp.observer;

public class BoyChild extends Children {

	public BoyChild(String nm) {
		super(nm);
	}

	public void addCustomObserver(Parent subj) {
		this.parents.add(subj);
	}

	protected void whatDidYouDoKid(CustomEvent event) {
		if (event.isItGood()) {
			System.out.println("Yeeeeeeeeeeeeee, i'm the best!!!!");
			notifyObservers(event);

		} else if (event.isItBad()) {
			System.out.println("Fuck you, go ahead tell my parents");
			notifyObservers(event);

		} else if (event.isItVeryBad()) {
			System.out.println(":((");
			notifyObservers(event);

		} else {
			System.out.println("Waaaa?");
		}

	}

}
