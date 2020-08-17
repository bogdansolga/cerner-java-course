package com.cerner.java.training.d05.streams;

import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;

public class StreamsMain {

	public static void main(String[] args) {
		readingFromAFile();
	}

	private static void readingFromAFile() {
		try (FileReader fileReader = new FileReader(new File("some-text.txt"))) {
			char[] buffer = new char[500];
			fileReader.read(buffer);
			
			System.out.print(buffer);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
