/**
 * 
 */
package com.wipro.java.oops.encapsulation;

/**
 * 
 */
public class Animal {
 
	
	public Animal(String name, int hervivoresNo) {
		super();//calls the root parent class=object
		this.name = name;
		this.hervivoresNo = hervivoresNo;
	}
	
	private String name;
	private int hervivoresNo;
	
	public int getHervivoresNo() {
		return hervivoresNo;
	}
	public void setHervivoresNo(int hervivoresNo) {
		
		if(hervivoresNo>0) {
			this.hervivoresNo=hervivoresNo;
		}
		else
		System.out.println("Hervivores Number must be positive");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static void main(String a[]) {
		
		Animal p1=new Animal("Alice", 12);
		System.out.println(p1.getHervivoresNo());
		System.out.println(p1.getName());
		
		p1.setHervivoresNo(15);
		System.out.println(p1.getHervivoresNo());
		System.out.println(p1.getName());
		
		p1.setHervivoresNo(-5);
		
		
	}
	
}

