package com.test.dp.interpreter;

public class Client {

	public static void main(String[] args) {
		String number = "78347889";
		NumberContext nc = new NumberContext(number);

		NumberExpression ne = new OddNumberExpression();
		ne.interpret(nc);
	}

}
