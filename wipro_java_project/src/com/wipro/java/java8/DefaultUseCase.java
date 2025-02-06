package com.wipro.java.java8;


interface TestInterface4{
	default void show() {
		int num1 = 20;
		int num2 = 5;
		int result = num1 *num2;
		System.out.println("My output is: " + result);
	}
}
interface TestInterface3{
	default void show() {
		int num1 = 8 ; int num2 = 6; int sum = 0;
		 sum = num1 + num2;
		System.out.println("The sum is: " + sum );
	}
}
public class DefaultUseCase implements TestInterface3 ,TestInterface4 {
	

	@Override
	public void show() {
		//using super keyword to call the show method of TestInterface3
				TestInterface3.super.show();
				//using super keyword to call the show method of TestInterface4
				TestInterface4.super.show();
		
	}
public static void main(String[] args) {
	DefaultUseCase d  = new DefaultUseCase();
	d.show();
	}

}
