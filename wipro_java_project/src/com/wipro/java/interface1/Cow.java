/**
 * 
 */
package com.wipro.java.interface1;

/**
 * 
 */
public class Cow implements Animal {

	/**
	 * @param args
	 */
	

	@Override
	public void makeSound() {
		System.out.println("Humbaaaa!!!!");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Animal cow1 = new Cow();
      cow1.makeSound();
	}

}
