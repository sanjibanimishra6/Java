/**
 * 
 */
package com.wipro.java.exception;

/**
 * 
 */
import java.io.*;

public class CheckedUnchecked{
    
    // Method for a Checked Exception (IOException)
    static void readFile(){
    	try {
			
			 File file = new File("Idontexist.txt");
	            FileReader fr = new FileReader(file);  //  FileNotFoundException (Checked Exception)
	        } 
		catch (IOException e) {
	            System.out.println("Sorry there is no such file: " + e.getMessage());
	        }
    }

    // Method for an Unchecked Exception (ArithmeticException)
    static void divideByZero() {
    	
        int num1 = 10, num2 =30,num3 = 0 ;
        try {
        int result = (num1 +num2)/num3; // This will throw ArithmeticException
      }
        
        	catch(Exception e) {
    			System.out.println(e.toString());
    		}
        }
    

    public static void main(String[] args) {
        // Handling Checked Exception
    	System.out.println("Handling Checked Exceptions");
        readFile();

        // Handling Unchecked Exception
        System.out.println("Handling Unchecked Exceptions");
        divideByZero();
        System.out.println("Both the exceptions are handled😊.");
    }
}
