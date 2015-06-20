package com.test.dp.main;

public class DPMain {

	public static void main(String args[]) {
		DPExecutor exec = DPFactoryExecutor.getExecutor(DPExecutorType.INTERPRETER);
		
		
		exec.execute(null);
	}
}
