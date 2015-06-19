package com.test.dp.interpreter;

public class EvenNumberExpression extends AbstractNumberExpression {

	private final AbstractNumberExpression oddExpression;

	public EvenNumberExpression(AbstractNumberExpression ane) {
		this.oddExpression = ane;
	}

	public EvenNumberExpression() {
		this.oddExpression = new OddNumberExpression(this);
	}

	public void interpret(NumberContext numberContext) {
		Integer nr = getNextNumberFromContext(numberContext);
		if (nr == null) {
			return;
		}

		if (canInterpret(nr)) {
			interpretInternal(nr);
		} else {
			oddExpression.interpretInternal(nr);
		}
		interpret(this.getRemainingContext(numberContext));
	}

	protected boolean canInterpret(Integer nr) {
		return (nr % 2 == 0);
	}

	protected void interpretInternal(Integer nr) {
		System.out.println("Even interpretation of: " + nr);
	}

}
