package com.cerner.java.training.d05.streams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

@SuppressWarnings("unused")
public class StreamsMain {

	public static void main(String[] args) {
		//readingFromAFile();
		
		//readingFromAFileUsingABuffer();
		
		//writingToAFile();
		
		readingFromTheKeyboard();
	}

	private static void readingFromTheKeyboard() {
		System.out.println("Please enter a text:");
		Scanner scanner = new Scanner(System.in);
		String enteredText = scanner.nextLine();
		
		System.out.println("You have entered: " + enteredText);
	}

	private static void writingToAFile() {
		try (FileWriter fileWriter = new FileWriter("output.txt")) {
			fileWriter.append("Some text to write");
			fileWriter.append(System.lineSeparator());
			fileWriter.append("And some more text");
			// and the rest of the text
			
			fileWriter.flush();
			System.out.println("The file and content were successfully saved");
		} catch (IOException exception) {
			exception.printStackTrace();
		}
	}

	private static void readingFromAFileUsingABuffer() {
		try (FileReader fileReader = new FileReader(new File("some-text.txt"));
			 BufferedReader bufferedReader = new BufferedReader(fileReader)) {
			
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
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
