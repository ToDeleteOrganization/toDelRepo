package com.test.dp.interpreter;

public abstract class AbstractNumberExpression implements NumberExpression {

	private static final String EMPTY_STRING = "";

	protected abstract void interpretInternal(Integer nr);
	
	protected boolean canInterpret(Integer nr) {
		return (nr != null) ? true : false;
	}

	protected Integer getNextNumberFromContext(NumberContext nc) {
		Integer nextNumber = null;
		NumberContext nnc = nc.getNextNumberContext();
		
		if (nnc != null) {
			String number = nnc.getNumber();
			nextNumber = Integer.parseInt(number);
		}
		
		return nextNumber;
	}

	protected NumberContext getRemainingContext(NumberContext nc) {
		NumberContext ncold = nc.getNextNumberContext();
		String number = ncold.getNumber();
		
		String number2 = nc.getNumber();
		number2 = number2.replaceFirst(number, EMPTY_STRING);

		return new NumberContext(number2);
	}


}
