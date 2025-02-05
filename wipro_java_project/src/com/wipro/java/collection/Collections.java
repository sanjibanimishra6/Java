package com.wipro.java.collection;
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Collections {

	public static void main(String[] args) {
		/*Implementation of array
		 * 
		 */
		
		
		
		 int []arr;
		//allocating memory for 5 integers
		   arr = new int[5];
		  arr[0] = 10;
		  arr[1] = 20;
		  arr[2] = 30;
		  arr[3] = 40;
		  arr[4] = 50;

		//accessing elements from the specified array
		for(int i = 0; i < arr.length;i++) {
			System.out.println("Element at index " + i + ":" + arr[i]);
		}
		//Implementations of List and its operations
		
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
        
        // Implementation of LinkedList
      //size of the linked list
      		int n = 5;
      		List<Integer> li = new LinkedList<Integer>();
      		for (int i = 1; i <= n; i++)
      			li.add(i);
       
      		// Printing elements
      		System.out.println(li);
       
      		// Remove element at index 3
      		li.remove(3);// index
       
      		// Displaying the list after deletion
      		System.out.println(li);
       
      		// Printing elements one by one
      		for (int i = 0; i < li.size(); i++)
      		{
      			System.out.print(li.get(i) + " ");
      			}
      		
      		//Implementation of Map
      	//Creating a Hash Map where integer is the key and String is the value
    		Map<Integer,String> map = new HashMap<>();
    		
    		//adding key-value pairs to the map
    		map.put(1, "Grapes");
    		map.put(2, "Watermelon");
    		map.put(3, "Orange");
    		
    		//Accessing values in a key
            System.out.println("Key 1: " + map.get(1));
            System.out.println("Key 2: " + map.get(2));
           //Checking if map contains the key
            if(map.containsKey(3)) {
            	 System.out.println("Key 3 exists with value: " + map.get(3));
            }
          //Iterating over the map
            System.out.println("Iterating through the map: ");
            for(Map.Entry<Integer, String> entry : map.entrySet()) {
            	System.out.println(entry.getKey() + " :" + entry.getValue());
            }
            
            //Removing the key-value pair
            map.remove(2);
            System.out.println("Map after removal of key 2: ");
            for(Map.Entry<Integer, String> entry : map.entrySet()) {
            	System.out.println(entry.getKey() + " :" + entry.getValue());
            }
            

	}

}
