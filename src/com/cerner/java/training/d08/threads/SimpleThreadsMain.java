package com.cerner.java.training.d08.threads;

import com.cerner.java.training.d01.Product;

public class SimpleThreadsMain {

	public static void main(String[] args) {
		Product product = new Product(10, "Lemonade");
		ProductDisplay productDisplay = new ProductDisplay(product);
		
		Thread productDisplayThread = new Thread(productDisplay);
		productDisplayThread.start(); // the .run method is automatically invoked by the JDK
	}
	
	private static class ProductDisplay implements Runnable {
		private final Product product;
		
		public ProductDisplay(Product product) {
			this.product = product;
		}

		@Override
		public void run() {
			Thread currentThread = Thread.currentThread();
			currentThread.setName("our-thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(currentThread.getName() + "/" + currentThread.getState() + " - " + product);
		}
	}
}
