/**
 * 
 */
package com.wipro.java.interface1;

/**
 * 
 */
public class Document implements Showable,Printable {


	
	public void print() {
		System.out.println("Print");
	}	
	
	public void show() {
		System.out.println("Show");
		
	}
public static void main(String[] args) {
		Document d1 = new Document();
		d1.show();
		d1.print();

	}

}
