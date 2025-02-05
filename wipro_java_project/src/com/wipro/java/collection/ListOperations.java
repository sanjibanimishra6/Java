/**
 * 
 */
package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class ListOperations {
//Main driver method
	public static void main(String[] args) {
		//Creating object of list interface implemented by the array list class
		List<Integer> l1 = new ArrayList<Integer>();
		//Adding elements
		 l1.add(0,1);
		 l1.add(1,3);
		 l1.add(2,5);
		 l1.add(3,7);
		 //Printing the elements
		 System.out.println(l1);
		 /* Now Creating another list l2 */
		 
		 List<Integer> l2 = new ArrayList<Integer>();
		 l2.add(2);
		 l2.add(4);
		 l2.add(6);
		 l2.add(8);
		 
		//Printing the elements of l2
		 System.out.println(l2);
        l1.addAll(1,l2);
        System.out.println(l1);
        
        //Remove operation
        l1.remove(1);
        System.out.println(l1);
        //setting the element for  the index
        l1.set(0, 5);
        System.out.println(l1);
      
	}

}
