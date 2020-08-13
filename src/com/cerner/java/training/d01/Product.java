package com.cerner.java.training.d01;

// data holding class
public class Product implements Comparable<Product> { // --> a classical POJO example (Plain Old Java Object)
	
	private static final String TABLE_NAME = "product";
	
	// will be invoked just the first time when the class is initialized / objects from that class are created
	static {
		//System.out.println("Initializing the class");
	}
	
	private int id;
	private String name;
	
	// default constructor; available even if it's not explicitly created
	//public Product() {}

	public Product(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	void processName() {
		System.out.println(TABLE_NAME);
		System.out.println("Processing the '" + name + "'...");
	}
	
	// 'factory' method --> used to create objects from that class
	public static Product createProduct(int id, String name) {
		return new Product(id, name);
	}
	
	public void process() {
		System.out.println("Processing a Product...");
	}

	@Override
	public String toString() {
		return id + ", " + name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		
		Product other = (Product) obj;
		if (id != other.id) return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		
		return true;
	}

	@Override
	public int compareTo(Product o) {
		return Integer.compare(id, o.id);
	}
}
