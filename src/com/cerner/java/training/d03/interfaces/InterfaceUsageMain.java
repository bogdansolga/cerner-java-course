package com.cerner.java.training.d03.interfaces;

import com.cerner.java.training.d01.Product;

public class InterfaceUsageMain {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		ProductInterface fileSystemService = new FileSystemProductService();
		ProductInterface databaseService = new DatabaseProductService();
		
		// we can hide the source of a Product --> we know we retrieve one, we can change the source any-time (file-system / database)
		@SuppressWarnings("unused")
		Product theProduct = databaseService.get(10);
	}
}
