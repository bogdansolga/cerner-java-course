package com.cerner.java.training.d08.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMain {

	public static void main(String[] args) {
		//simplePatternMatchings();
		
		capturingGroups();
	}

	private static void capturingGroups() {
		Pattern datePattern = Pattern.compile("([0-9]{2})/(\\d{2})/(\\d{4})");
		Matcher matcher = datePattern.matcher("27/08/2020");
		//System.out.println(matcher.matches());
		
		if (matcher.matches()) {
			System.out.println("The day is " + matcher.group(1));
			System.out.println("The month is " + matcher.group(2));
			System.out.println("The whole group is " + matcher.group(0));
		}
	}

	private static void simplePatternMatchings() {
		System.out.println("t".matches("."));
		System.out.println("t".matches("\\."));
		System.out.println(".".matches("\\."));
		
		System.out.println("9".matches("\\d"));
		System.out.println("f".matches("\\d"));
		System.out.println("94233249 - " + "94233249".matches("\\d+"));
		
		System.out.println("--------------------------");
		
		System.out.println("x".matches("[yxz]"));
		System.out.println("f".matches("[1-5a-g]"));
	}

}
