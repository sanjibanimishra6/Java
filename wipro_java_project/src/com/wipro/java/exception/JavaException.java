/**
 * 
 */
package com.wipro.java.exception;

/**
 * 
 */
public class JavaException {

	
	public static void main(String[] args) {
		
		int num1 = 25; int num2 = 5; int num3 = 0 ;int answer;
		try {
		 answer=(num1*num2)/num3 ; //the exception
		}
		//Handling the exception
		catch(Exception e) {
			System.out.println(e.toString());
		}
		finally {
			int sum = num1+num2;
			System.out.println("The answer is " + sum);
			
		}
		System.out.println("My exception is being handled");
		
	}

	}


