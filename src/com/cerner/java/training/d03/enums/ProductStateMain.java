package com.cerner.java.training.d03.enums;

public class ProductStateMain {

	public static void main(String[] args) {
		ProductState state = ProductState.NEW;
		System.out.println(state.getResellingPercentage());
		System.out.println(state.ordinal());
		
		ProductState another = ProductState.valueOf("NEW");
		System.out.println(another);
		
		//ProductState inexisting = ProductState.valueOf("doesnt"); // !! be careful when instantiating enums dynamically
		
		for (ProductState theState : ProductState.values()) {
			System.out.println(theState);
		}
		
		// one of the most useful usage modes
		switch(state) {
			case NEW: 
				System.out.println("The product is new");
				break;
				
			case USED:
				System.out.println("The product is used");
				break;
				
			default: System.err.println("There is no action for " + state);
		}
		
		System.out.println(state == another);
		
		ProductState byValue = ProductState.byValue(100);
		System.out.println(byValue);
	}
}
