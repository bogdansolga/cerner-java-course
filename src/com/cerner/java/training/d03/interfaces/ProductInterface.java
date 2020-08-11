package com.cerner.java.training.d03.interfaces;

import com.cerner.java.training.d01.Product;

// can be considered an abstract class which has only(*) abstract methods
public interface ProductInterface {
	
	public Product get(int id);
}
