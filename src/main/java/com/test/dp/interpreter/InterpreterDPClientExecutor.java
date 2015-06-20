package com.test.dp.interpreter;

import com.test.dp.main.DPArguments;
import com.test.dp.main.DPExecutor;

public class InterpreterDPClientExecutor implements DPExecutor {

	public void execute(DPArguments args) {
		String number = "78347889";
		NumberContext nc = new NumberContext(number);

		NumberExpression ne = new OddNumberExpression();
		ne.interpret(nc);
	}

}
