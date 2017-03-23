package com.prashanth.learning.sample4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionHandling {

	public static void main(String[] args) {
		String filename="C:/Users/Prashanth/Documents/Sandbox/Java_Learning/src/com/prashanth/learning/sample3/test.txt";
		
		File test=new File(filename);
		try {
			FileReader fr=new FileReader(test);
		} catch (FileNotFoundException e) {
			System.out.println("File "+filename.toString()+" not found in the path defined.");
		}
		

	}

}
