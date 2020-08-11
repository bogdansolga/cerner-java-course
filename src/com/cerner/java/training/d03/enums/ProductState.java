package com.cerner.java.training.d03.enums;

import java.util.Iterator;

public enum ProductState {
	NEW(100), USED(80);
	
	private final int resellingPercentage;

	private ProductState(int resellingPercentage) {
		this.resellingPercentage = resellingPercentage;
	}

	public int getResellingPercentage() {
		return resellingPercentage;
	}
	
	public static ProductState byValue(int value) {
		// TODO iterate over the values, return the one that equals the parameter
		for (ProductState item : values()) {
			if (item.resellingPercentage == value) {
				return item;
			}
		}
		
		throw new IllegalArgumentException("There is no item with the value " + value);
	}
}
