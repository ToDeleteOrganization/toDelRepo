package com.test.dp.interpreter;

public class NumberContext {

	private String number;
	
	public NumberContext(String number) {
		this.number = number;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public boolean hasNumbers() {
		return (this.number.length() > 0);
	}

	public NumberContext getNextNumberContext() {
		NumberContext context = null;
		if (this.hasNumbers()) {
			String str = String.valueOf(this.number.charAt(0));
			context = new NumberContext(str);
		}
		return context;
	}

}