package com.cerner.java.training.d06.serializing;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.cerner.java.training.d01.Product;

public class SerializingMain {
	
	private static final String FILE_NAME = "object.ser";

	public static void main(String[] args) {
		serializingAnObject();
		
		deSerializingAnObject();
	}

	private static void serializingAnObject() {
		try (FileOutputStream fileOutputStream = new FileOutputStream(FILE_NAME);
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
			Product product = new Product(10, "Umbrella");
			objectOutputStream.writeObject(product);
			
			System.out.println("The object was successfully serialized");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void deSerializingAnObject() {
		try (FileInputStream fileInputStream = new FileInputStream(FILE_NAME);
				ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
			
			Object object = objectInputStream.readObject();
			if (object instanceof Product) {
				Product product = (Product) object;
				System.out.println(product);
			}
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
