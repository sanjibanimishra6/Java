package com.wipro.java.oops.abstraction;

public  class Dzire extends Cars {
	
	

	@Override
	void BrandName() {
		// TODO Auto-generated method stub
		System.out.println("The Brand name is Maruti" );
	}

	@Override
	void Milage() {
		// TODO Auto-generated method stub
		System.out.println("The Mileage is 25-26kmpl" );
	}

	public static void main(String[]args) {
		Cars car = new Dzire();
		car.BrandName();
		car.Milage();
	}
	

}
