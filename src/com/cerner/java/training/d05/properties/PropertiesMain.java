package com.cerner.java.training.d05.properties;

import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesMain {

	public static void main(String[] args) {
		//loadingAPropertiesFile();
		
		displayingSystemProperties();
	}

	private static void loadingAPropertiesFile() {
		Properties properties = new Properties();
		try {
			properties.load(PropertiesMain.class.getResourceAsStream("product.properties"));
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
		
		Set<Object> keySet = properties.keySet();
		for (Object object : keySet) {
			System.out.println(object + " -> " + properties.getProperty(object.toString()));
		}
	}
	
	private static void displayingSystemProperties() {
		Properties systemProperties = System.getProperties();
		Set<String> propertyNames = systemProperties.stringPropertyNames();
		for (String propertyName : propertyNames) {
			if (propertyName.contains("path")) {
				System.out.println(propertyName + " -> " + systemProperties.getProperty(propertyName));
			}
		}
	}
}
