package com.cerner.java.training.d04.arrays;

public class ArraysMain {

	public static void main(String[] args) {
		Integer[] integers = new Integer[3]; // an array initialized just with the length, not with the values
		displayValues(integers);
		
		integers[2] = 8;
		displayValues(integers);
		
		String[] strings = new String[]{"first", "second", "third"}; // an array initialized with the values --> their number determines the array length
		displayValues(strings);
	}

	// DRY - don't repeat yourself
	private static void displayValues(Object[] values) {
		for (Object value : values) {
			System.out.println(value);
		}
		System.out.println("-----------------------");
	}
}
