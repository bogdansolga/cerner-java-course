package com.cerner.java.training.d03.generics;

import com.cerner.java.training.d01.Product;

public abstract class AbstractConverter<Input extends Product, Output> {

	public abstract Output convert(Input input);
}
