package com.cerner.java.training.d03.generics;

import com.cerner.java.training.d01.Product;

public class ProductConverter extends AbstractConverter<Product, String> {

	@Override
	public String convert(Product input) {
		return input.toString();
	}
}
