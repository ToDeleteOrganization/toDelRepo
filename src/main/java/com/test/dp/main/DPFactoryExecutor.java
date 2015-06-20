package com.test.dp.main;

import com.test.dp.interpreter.InterpreterDPClientExecutor;
import com.test.dp.iterator.IteratorDPExecutor;
import com.test.dp.observer.ObserverDPExecutor;
import com.test.dp.strategy.StrategyDPExecutor;

public final class DPFactoryExecutor {

	public static DPExecutor getExecutor(DPExecutorType type) {
		DPExecutor executor = null;

		switch(type) {
		case INTERPRETER:
			executor = new InterpreterDPClientExecutor();
			break;
		case ITERATOR:
			executor = new IteratorDPExecutor();
			break;
		case OBSERVER:
			executor = new ObserverDPExecutor();
			break;
		case STRATEGY:
			executor = new StrategyDPExecutor();
			break;
		default:
			break;
		}

		return executor;
	}
}
