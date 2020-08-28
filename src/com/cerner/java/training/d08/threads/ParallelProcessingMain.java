package com.cerner.java.training.d08.threads;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import com.cerner.java.training.d01.Product;

public class ParallelProcessingMain {
	
	private static final int AVAILABLE_PROCESSORS = Runtime.getRuntime().availableProcessors();

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(AVAILABLE_PROCESSORS); // wraps / represents a thread pool
		// wraps a thread pool, responsible for the async processing of the submitted tasks
		ExecutorCompletionService<Double> executorCompletionService = new ExecutorCompletionService<>(executorService); 
		
		List<Product> products = Arrays.asList(
				new Product(10, "Lemonade", 10), 
				new Product( 5, "Coffee", 5), 
				new Product(12, "IceCream", 9),
				new Product(14, "Mellon", 2)
		);
		
		for (Product product : products) {
			executorCompletionService.submit(new ProductPriceProcessor(product));
		}
		
		long now = System.currentTimeMillis();
		Set<Double> prices = new HashSet<>();
		try {
			for (int i = 0; i < products.size(); i++) {
				Future<Double> productPrice = executorCompletionService.poll(1100, TimeUnit.MILLISECONDS);
				if (productPrice != null && productPrice.isDone()) {
					//Double price = productPrice.get();
					//System.out.println(Thread.currentThread().getName() + " - Got the price " + price);
					prices.add(productPrice.get());
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		System.out.println("The processing took " + (System.currentTimeMillis() - now) + " millis");
		System.out.println("Got the prices " + prices);
		
		executorService.shutdown();
	}

	private static class ProductPriceProcessor implements Callable<Double> {
		
		private static final Random RANDOM = new Random();
		
		private final Product product;
		
		public ProductPriceProcessor(Product product) {
			this.product = product;
		}

		@Override
		public Double call() throws Exception {
			//System.out.println(Thread.currentThread().getName() + ": processing the " + product.getName() + "...");
			Thread.sleep(RANDOM.nextInt(1000));
			return product.getPrice();
		}
	}
}
