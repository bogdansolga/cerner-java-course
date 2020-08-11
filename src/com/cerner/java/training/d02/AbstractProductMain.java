package com.cerner.java.training.d02;

public class AbstractProductMain {

	public static void main(String[] args) {
		AbstractProduct tablet = new Tablet();
		System.out.println(tablet.getType());
		
		SportItem sportItem = new SportItem();
		System.out.println(sportItem.getType());
		
		sportItem.displayType();
	}

}
