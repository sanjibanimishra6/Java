/**
 * 
 */
package com.wipro.java.oops;

/**
 * 
 */
public class Flower {

	/**
	 * 
	 */
	String color;
	int petalnum ;
	public Flower(String colour, int petalno) {
		this.color = colour;
		this.petalnum = petalno;
	}
void display() {
	System.out.println("Flower Colour " + color + " No of petals " + petalnum);
}
	
	public static void main(String[] args) {
		Flower flowerobj1 = new Flower("BLue",5);
		Flower flowerobj2 = new Flower("BLue",5);
		
		 flowerobj1 .display();
		 flowerobj2.display(); 
	}

}
