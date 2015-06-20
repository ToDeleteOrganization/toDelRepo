package com.test.dp.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Parent implements CustomObserver<Children> {

	protected List<Children> observedChildren = new ArrayList<Children>();

	public abstract void watchOver(Children child);
}
