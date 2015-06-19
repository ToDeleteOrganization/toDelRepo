package com.test.dp.interpreter;

public class OddNumberExpression extends AbstractNumberExpression {

	private final AbstractNumberExpression evenExpression;

	public OddNumberExpression(AbstractNumberExpression ane) {
		this.evenExpression = ane;
	}

	public OddNumberExpression() {
		this.evenExpression = new EvenNumberExpression(this);
	}

	public void interpret(NumberContext numberContext) {
		Integer nr = getNextNumberFromContext(numberContext);
		if (nr == null) {
			return;
		}

		if (canInterpret(nr)) {
			interpretInternal(nr);
		} else {
			evenExpression.interpretInternal(nr);
		}

		interpret(this.getRemainingContext(numberContext));
	}

	protected boolean canInterpret(Integer nr) {
		return (nr % 2 == 1);
	}

	protected void interpretInternal(Integer nr) {
		System.out.println("Odd interpretation of: " + nr);
	}

}
