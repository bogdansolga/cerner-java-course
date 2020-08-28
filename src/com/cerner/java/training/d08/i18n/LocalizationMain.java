package com.cerner.java.training.d08.i18n;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class LocalizationMain {
	
	private static Locale roLocale = new Locale("ro", "RO");
	private static Locale usLocale = new Locale("en", "US");
	private static Locale deLocale = new Locale("de", "DE");

	public static void main(String[] args) {
		//usingAResourceBundle();
		
		formattingDates();
		
		//formattingNumbers();
	}

	private static void formattingNumbers() {
		NumberFormat roFormat = NumberFormat.getNumberInstance(roLocale);
		NumberFormat deFormat = NumberFormat.getNumberInstance(deLocale);
		NumberFormat usFormat = NumberFormat.getNumberInstance(usLocale);
		
		Integer number = 72131238;
		
		System.out.println(roFormat.format(number));
		System.out.println(deFormat.format(number));
		System.out.println(usFormat.format(number));
		
		DecimalFormat decimalFormat = new DecimalFormat("###,#####");
		System.out.println(decimalFormat.format(number));
	}

	private static void formattingDates() {
		DateFormat roDateFormat = DateFormat.getDateInstance(DateFormat.FULL, roLocale);
		System.out.println(roDateFormat.format(new Date()));
		
		DateFormat usDateFormat = DateFormat.getDateInstance(DateFormat.FULL, usLocale);
		System.out.println(usDateFormat.format(new Date()));
		
		DateFormat deDateFormat = DateFormat.getDateInstance(DateFormat.FULL, deLocale);
		System.out.println(deDateFormat.format(new Date()));
		
		System.out.println("------------------------");
		
		DateFormat dateAndTimeFormat = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, usLocale);
		System.out.println(dateAndTimeFormat.format(new Date()));
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd---HH:mm:ss", usLocale);
		System.out.println(sdf.format(new Date()));
	}

	private static void usingAResourceBundle() {
		ResourceBundle resourceBundle = ResourceBundle.getBundle("messages", deLocale);
		System.out.println(resourceBundle.getString("greeting"));
	}
}
