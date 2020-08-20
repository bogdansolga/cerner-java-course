package com.cerner.java.training.d05.strings;

import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class StringsMain {

	public static void main(String[] args) {
		//simpleMethods();
		
		//stringBuilderAndBuffer();
		
		//stringTokenizing();
		
		stringsAreImmutable();
	}

	private static void stringTokenizing() {
		StringTokenizer stringTokenizer = new StringTokenizer("I wish you a wonderful week, and a chilled holiday+weekend", ", +");
		while (stringTokenizer.hasMoreElements()) {
			System.out.println(stringTokenizer.nextToken().trim());
		}
	}

	private static void stringBuilderAndBuffer() {
		StringBuilder stringBuffer = new StringBuilder();
		stringBuffer.append("some ")
					.append("parts ")
					.append("of ")
					.append(true)
					.append("a text");
		System.out.println(stringBuffer.toString());
	}

	private static void simpleMethods() {
		String string = "Today is Monday";
		
		System.out.println(string.length());
		System.out.println(string.toUpperCase());
		System.out.println(string.substring(5, 9));
		
		List<String> words = Arrays.asList(string.split(" "));
		System.out.println(words);
	}
	
	private static void stringsAreImmutable() {
		String today = "Is raining outside";
		String subString = today.substring(5, 10); // each time when we invoke a method on a String, we _must_ obtain the resulted object
		System.out.println(subString);
		
		System.out.println(today);
	}
}
