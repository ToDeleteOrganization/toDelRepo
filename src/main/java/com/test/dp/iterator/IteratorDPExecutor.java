package com.test.dp.iterator;

import com.test.dp.main.DPArguments;
import com.test.dp.main.DPExecutor;

public class IteratorDPExecutor implements DPExecutor {

	public void execute(DPArguments args) {
		Store penny = new PennyStore();

		StoreIterator<Product> products = penny.getProducts();
		System.out.println("Classic iterator version");
		while (products.hasNext()) {
			System.out.println(products.next());
		}

		System.out.println("Iterable iterator version");
		for (Product p : products) {
			System.out.println(p);
		}
	}

}
