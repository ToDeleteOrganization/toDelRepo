package com.test.dp.iterator;

public class Product {

	private final String productName;

	private final Double productPrice;

	public Product(final String productName, final Double productPrice) {
		this.productName = productName;
		this.productPrice = productPrice;
	}

	public String getProductName() {
		return productName;
	}

	public Double getProductPrice() {
		return productPrice;
	}

	public String toString() {
		return "[productName = " + productName + ", for " + String.valueOf(productPrice) + "]";
	}
}
