package com.cerner.java.training.d04.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentLinkedQueue;

import com.cerner.java.training.d01.Product;

public class CollectionsMain {
	
	public static void main(String[] args) {
		//lists();
		
		//sets();
		
		//maps();
		
		//sortingObjects();
		
		// TreeSet + TreeMap 							--> sorted list / map
		// LinkedList + LinkedHashSet + LinkedHashMap 	--> as they are added order
		
		//iteratingOverCollections();
		
		queues();
	}

	private static void queues() {
		Queue<String> stringsQueue = new ConcurrentLinkedQueue<>();
		stringsQueue.add("something");
		stringsQueue.add("else");
		
		System.out.println(stringsQueue.remove());
	}

	private static void iteratingOverCollections() {
		Set<String> strings = new HashSet<>();
		strings.addAll(Arrays.asList("first", "second"));
		
		Iterator<String> iterator = strings.iterator(); // the recommended way to modify a collection while iterating over it
		while (iterator.hasNext()) {
			String nextValue = iterator.next();
			if (nextValue.length() == 5) {
				iterator.remove();
			}
		}
		
		System.out.println(strings);
	}

	private static void sortingObjects() {
		List<String> strings = Arrays.asList("unordered", "elements");
		Collections.sort(strings);
		//System.out.println(strings);
		
		List<Product> products = Arrays.asList(new Product(20, "IceCream"), new Product(12, "Lemonade"));
		Collections.sort(products);
		for (Product product : products) {
			//System.out.println(product);
		}
		
		Set<Product> productsSet = new TreeSet<>(); // use it for sorted collections
		productsSet.add(new Product(10, "Sun-cream"));
		productsSet.add(new Product(5, "Plane ticket"));
		for (Product product : productsSet) {
			System.out.println(product);
		}
	}

	private static void maps() {
		Map<Integer, String> weekDays = new HashMap<>();
		weekDays.put(1, "Monday");
		weekDays.put(2, "Tuesday");
		weekDays.put(1, "the other Monday");
		//weekDays.put(null, "what happens?"); // even if it works, we should not have null keys
		
		Set<Integer> keys = weekDays.keySet();
		System.out.println(keys);
		
		for (Integer key : keys) {
			System.out.println(key + " -> " + weekDays.get(key));
		}
		
		Collection<String> values = weekDays.values();
		System.out.println(values);
		
		Set<Entry<Integer, String>> entries = weekDays.entrySet(); // an entry = a pair of key
		for (Entry<Integer, String> entry : entries) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
	}

	private static void sets() {
		Set<String> strings = new HashSet<>(); // the elements order is _not_ guaranteed
		strings.addAll(Arrays.asList("first", "second", "first"));
		System.out.println(strings);
		
		Set<Product> products = new HashSet<>();
		products.add(new Product(10, "IceCream"));
		products.add(new Product(11, "Lemonade"));
		System.out.println(products.size());
		
		Set<String> orderedSet = new TreeSet<>();
		orderedSet.addAll(Arrays.asList("a", "few", "unordered", "elements"));
		System.out.println(orderedSet);
		
		Set<String> linkedSet = new LinkedHashSet<>();
		linkedSet.addAll(Arrays.asList("a", "few", "unordered", "elements"));
		System.out.println(linkedSet);
	}

	private static void lists() {
		List<String> holidayDestinations = new ArrayList<>();
		holidayDestinations.add("Mountains");
		holidayDestinations.add("Sea");
		holidayDestinations.addAll(Arrays.asList("Greece", "Croatia", "France"));
		
		for (String string : holidayDestinations) {
			System.out.println(string);
		}
		
		boolean removed = holidayDestinations.remove("Greece");
		boolean removedForNotExistentItem = holidayDestinations.remove("Somewhere");
		System.out.println(removed + " / " + removedForNotExistentItem);
		
		String theRemovedEntry = holidayDestinations.remove(2);
		System.out.println(theRemovedEntry);
		
		//List<int> intList = ... --> we cannot create collections of primitive types
		List<Integer> integers = new ArrayList<>();
	}
}
