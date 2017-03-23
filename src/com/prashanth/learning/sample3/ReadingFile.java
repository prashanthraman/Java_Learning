package com.prashanth.learning.sample3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFile {

	public static void main(String[] args) throws FileNotFoundException {
		// Trying to read file using Scanner
		String filename="C:/Users/Prashanth/Documents/Sandbox/Java_Learning/src/com/prashanth/learning/sample3/test.txt";
		
		File test=new File(filename);
		Scanner scan=new Scanner(test);
		
		while(scan.hasNextLine()){
			String line=scan.nextLine();
			System.out.println(line);
		}
		
		scan.close();

	}

}
