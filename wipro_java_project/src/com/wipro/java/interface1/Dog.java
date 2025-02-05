/**
 * 
 */
package com.wipro.java.interface1;

/**
 * 
 */
public class Dog implements Animal {

	@Override
	public void makeSound() {
		System.out.println("Woof Woof!!!!");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Animal Dog1 = new Dog();
      Dog1.makeSound();
	}

	

}
