package com.cerner.java.training.d02;

public abstract class AbstractProduct {
	public abstract String getType();
	
	/**
	 * This method should no longer be used because it was replaced by the {@link #displayByTypeAndQuality} method
	 */
	@Deprecated
	public void displayType() {
		System.out.println(getType());
	}
	
	public void displayByTypeAndQuality() {
		
	}
}
