/**
 * 
 */
package com.wipro.java.collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
	//Main driver method
	public static void main(String[] args) {
		//size if the linked list
		int n = 5;
		List<Integer> l1 = new LinkedList<Integer>();
		for (int i = 1; i <= n; i++)
			l1.add(i);
 
		// Printing elements
		System.out.println(l1);
 
		// Remove element at index 3
		l1.remove(3);// index
 
		// Displaying the list after deletion
		System.out.println(l1);
 
		// Printing elements one by one
		for (int i = 0; i < l1.size(); i++)
			System.out.print(l1.get(i) + " ");

}
	}
