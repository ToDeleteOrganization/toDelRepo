package com.test.dp.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProductIterator implements StoreIterator<Product> {

	private final List<Product> products = new ArrayList<Product>();

	private int currentPos;

	public ProductIterator() {
		products.add(new Product("gum", 1.5));
		products.add(new Product("shoes", 11.5));
	}

	public boolean hasNext() {
		return products.size() > currentPos;
	}

	public Product next() {
		return products.get(currentPos++);
	}

	public Iterator<Product> iterator() {
		return products.iterator();
	}

}
