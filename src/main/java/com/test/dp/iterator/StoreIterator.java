package com.test.dp.iterator;

public interface StoreIterator<T> extends Iterable<T> {

	public boolean hasNext();
	
	public T next();

}
