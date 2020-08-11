package com.cerner.java.training.d02;

public class ImmutableProductMain {

	public static void main(String[] args) {
		ImmutableProduct product = new ImmutableProduct(10, "Sunglasses");
		System.out.println(product.getName());
		
		ImmutableProduct anotherOne = new ImmutableProduct(20, "New " + product.getName());
		System.out.println(anotherOne.getName());
	}
}
