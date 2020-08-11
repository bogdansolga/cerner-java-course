package com.cerner.java.training.d03.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import com.cerner.java.training.d01.Product;

public class GenericsMain {

	public static void main(String[] args) {
		preGenerics();
		
		withGenerics();
		
		usingAGenericClassesHierarchy();
		
		usingWildcardsAndExtends();
		
		usingInlineDefinedGenericTypes();
	}

	private static void usingInlineDefinedGenericTypes() {
		List<Product> productsList = Collections.singletonList(new Product(10, "IceCream"));
		Set<Product> productsSet = Collections.singleton(new Product(10, "IceCream"));
		
		List<String> strings = Arrays.asList("Let", "there", "be", "summer");
		
		displayItems(productsList, 1);
		displayItems(strings, 3);
	}
	
	private static <T> void displayItems(List<T> items, int until) {
		for (int i = 0; i < until; i++) {
			System.out.println(items.get(i));
		}
	}

	private static void usingWildcardsAndExtends() {
		List<? extends Product> listOfThings = new ArrayList<>(); // a list of everything, defined through a wildcard (?)
	}

	private static void usingAGenericClassesHierarchy() {
		ProductStack productStack = new ProductStack();
		productStack.add(new Product(10, "Goodies"));
		System.out.println(productStack.remove());
	}

	private static void withGenerics() {
		List<String> strings = new ArrayList<String>();
		strings.add("2"); // compile time error
	}

	// pre-Java 5
	private static void preGenerics() {
		List list = new ArrayList();
		list.add(2);
		list.add("Something");
		list.add(new Product(10, "Something"));
		
		for (Object item : list) {
			if (item instanceof String) {
				System.out.println(((String) item).length());
			}
		}
	}
}
