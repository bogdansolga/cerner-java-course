package com.cerner.java.training.d06.serializing;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.cerner.java.training.d01.Product;

public class XMLSerializingMain {
	
	private static final String FILE_NAME = "product.xml";

	public static void main(String[] args) {
		//serializingAnObject();
		
		deSerializingAnObject();
	}

	private static void serializingAnObject() {
		try (FileOutputStream fileOutputStream = new FileOutputStream(FILE_NAME);
				XMLEncoder xmlEncoder = new XMLEncoder(fileOutputStream)) {
			
			xmlEncoder.writeObject(new Product(10, "Lemonade"));
			
			System.out.println("The product was written");
		} catch (IOException ioex) {
			ioex.printStackTrace();
		}
	}
	
	private static void deSerializingAnObject() {
		try (FileInputStream fileInputStream = new FileInputStream(FILE_NAME);
				XMLDecoder xmlDecoder = new XMLDecoder(fileInputStream)) {
			
			Object object = xmlDecoder.readObject();
			if (object instanceof Product) {
				Product product = (Product) object;
				System.out.println(product);
			}
		} catch (IOException ioex) {
			ioex.printStackTrace();
		}
	}
}
