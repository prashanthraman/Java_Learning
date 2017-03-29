package com.prashanth.learning.s7.exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileExceptionHandling {
	public void ReadFile(String path) {
		File file1 = new File(path);
		FileReader fr = null;
		try {
			fr = new FileReader(file1);
		} catch (FileNotFoundException e) {
			System.out.println("File not found in the path.");
		}
		try {
			fr.read();
		} catch (IOException e) {
			System.out.println("Not able to read the file." + file1.toString());
		}
	}

}
