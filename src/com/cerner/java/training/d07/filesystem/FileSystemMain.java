package com.cerner.java.training.d07.filesystem;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileSystemMain {

	public static void main(String[] args) {
		String homePath = System.getProperty("user.home");
		System.out.println(System.getProperty("path.separator"));
		//System.out.println(homePath);
		
		Path home = Paths.get(homePath);
		
		File homeFolder = home.toFile();
		System.out.println(homeFolder.getPath());
		System.out.println(homeFolder.isDirectory() + ", " + homeFolder.canWrite());
		
		System.out.println(home.getParent().getFileName());
		System.out.println(home.getFileSystem().getSeparator());
		
		File output = new File("output.txt");
		System.out.println(output.exists());
		
		File newFolder = new File("new-folder");
		newFolder.mkdir();
		
		try {
			Files.delete(newFolder.toPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
