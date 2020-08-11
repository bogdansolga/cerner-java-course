package com.cerner.java.training.d02;

// the class is considered an 'internal' class, as it doesn't have the 'public' modifier
class ImmutableProduct {
	private final int id;
	private final String name;
	
	public ImmutableProduct(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}
