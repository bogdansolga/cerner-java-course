package com.cerner.java.training.d06.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionsMain {

	public static void main(String[] args) {
		//simpleExceptions();
		
		try {
			usingCheckedExceptions();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	private static void usingCheckedExceptions() throws FileNotFoundException {
		FileInputStream fileInputStream = new FileInputStream("some-text.txt");
	}

	private static void simpleExceptions() {
		String name = "Jane";
		try { // treating / handling the effect, not the cause
			System.out.println(name.length());
		} catch (NullPointerException npe) {
			System.err.println("The variable is not initialised");
			throw new RuntimeException("Please initilise the variable"); // --> exception type changing
		}
		
		String id = "23";
		try {
			int theId = Integer.parseInt(id);
			System.out.println(theId);
		} catch (NumberFormatException nfe) {
			System.err.println("'" + id + "' is not a number");
			throw new RuntimeException("Please introduce a valid number");
		}
		
		String pleaseDontDoThat = null;
		try { 
			System.out.println(pleaseDontDoThat.length());
		} catch (NullPointerException npe) {
			// not including any instruction --> exception swallowing
			// _PLEASE_ don't ever do that
		}
	}
}
