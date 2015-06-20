package com.test.dp.observer;

public class CustomEvent {

	private String description;
	
	private EventType eventType;
	
	public CustomEvent(final String evNm, final EventType eventType) {
		this.description = evNm;
		this.eventType = eventType;
	}
	
	public void setEventName(String evDescr) {
		this.description = evDescr;
	}

	public String getEventName() {
		return description;
	}

	public boolean isItGood() {
		return EventType.GOOD.equals(eventType);
	}

	public boolean isItBad() {
		return EventType.BAD.equals(eventType);
	}
	
	public boolean isItVeryBad() {
		return EventType.VERY_BAD.equals(eventType);
	}

}
