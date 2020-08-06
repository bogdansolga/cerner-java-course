package com.cerner.java.training.d01;

// data processing class --> service classes (they are performing some sort of business logic)
public class ProductMain {

	public static void main(String[] args) {
		Product iceCream = new Product(10, "Chocolate goodie");
		System.out.println("The icecream name is '" + iceCream.getName() + "'");
		
		Product anotherOne = Product.createProduct(5, "Watermelon");
		System.out.println(anotherOne.getId());
		
		iceCream.createProduct(15, "Lemonade"); // invoking a static method from an object leads to an IDE warning
		// avoid using them
		
		Tablet tablet = new Tablet(20, "Samsung something");
		
		iceCream.process();
		tablet.process();
		
		System.out.println(iceCream instanceof Product);
		System.out.println(tablet instanceof Product);
	}
	
	/*
	    Product iceCream = new Product();
		iceCream.setId(10);
		iceCream.setName("Chocolate goodie");
	 */
}
