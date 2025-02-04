/**
 * 
 */
package com.wipro.java.exception;

/**
 * 
 */
public class UncheckedException {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] numbers = {1, 2, 3};

	        try {
	            // Trying to access an invalid index
	            System.out.println("Value: " + numbers[5]);  
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Error: Array index out of bounds!");
	        }

	}

}
