package com.cerner.java.training.d07.debugging;

public class DebuggingMain {

	public static void main(String[] args) {
		anotherMethod(10, "Something");
		anotherMethod(29, "else");
	}

	private static void anotherMethod(int index, String word) {
		int value = index * 5;
		String result = value + " " + word;
		System.out.println("The result is " + result); // a logging statement --> it displays the value of a variable
	}

}
