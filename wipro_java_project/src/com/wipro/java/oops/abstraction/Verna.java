/**
 * 
 */
package com.wipro.java.oops.abstraction;

/**
 * 
 */
public class Verna extends Cars{

	@Override
	void BrandName() {
		// TODO Auto-generated method stub
		System.out.println("The Brand name is Hyndai" );
	}

	@Override
	void Milage() {
		// TODO Auto-generated method stub
		System.out.println("The mileage is  19-21 kmpl" );
	}

	/**
	 * 
	 */
	public static void main(String[]args) {
		Cars car = new Verna();
		car.BrandName();
		car.Milage();
	}

}
