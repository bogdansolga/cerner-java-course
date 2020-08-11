package com.cerner.java.training.d03.interfaces;

import com.cerner.java.training.d01.Product;

public class DatabaseProductService implements ProductInterface {

	@Override
	public Product get(int id) {
		return new Product(id, "From the database");
	}
}
