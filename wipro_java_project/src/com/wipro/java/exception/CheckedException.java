/**
 * 
 */
package com.wipro.java.exception;

/**
 * 
 */import java.io.File;
 import java.io.FileReader;
 import java.io.IOException;
public class CheckedException {

	
	public static void main(String[] args) {
		try {
			
			 File file = new File("Idontexist.txt");
	            FileReader fr = new FileReader(file);  // May throw FileNotFoundException (Checked Exception)
	        } 
		catch (IOException e) {
	            System.out.println("Sorry there is no such file: " + e.getMessage());
	        }
		}

	}


