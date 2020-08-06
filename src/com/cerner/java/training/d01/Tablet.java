package com.cerner.java.training.d01;

public class Tablet extends Product {
	
	public Tablet(int id, String name) {
		super(id, name);
	}

	private String producer;

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}
	
	public void process() {
		System.out.println("Processing a Tablet...");
	}
}
