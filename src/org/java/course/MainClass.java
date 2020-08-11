package org.java.course;

// class definition
public class MainClass {
	
	// all the variables have a type and a name
	// these are class variables --> can be accessed and modified by all the methods from that class
	private static int weekDay;	// type: int, 		name: weekDay
	private static double shoesPrice;
	private static String name;	// type: String, 	name: name
	
	// the main method is the starting point for every Java project
	public static void main(String[] args) {
		weekDay = 8; // --> variable assignment
		weekDay = 10;
		
		shoesPrice = 235.5;
		
		name = "Adi";
		
		// we can also use method variables
		String today = "Saturday";	// today = method variable
		
		// using variables
		System.out.println("Today is " + today);
		System.out.println(name + " is learning Java");
		
		System.out.println(sum(5, 10));
		System.out.println(sum(weekDay, 6));
	}
	
	// private / public: 	access specifiers					- optional
	// static / final: 		access modifiers					- optional
	// int:					return type; int = integer value	- mandatory
	// sum:					method name							- mandatory
	// first, second:		parameters							- optional
	private static int sum(int first, int second) {
		return first + second;
	}
	
	void doSomething() {
		
	}
}
