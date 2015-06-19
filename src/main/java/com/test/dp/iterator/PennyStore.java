package com.test.dp.iterator;

public class PennyStore implements Store {

	public ProductIterator getProducts() {
		return new ProductIterator();
	}


}
