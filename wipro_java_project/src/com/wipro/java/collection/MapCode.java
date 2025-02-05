/**
 * 
 */
package com.wipro.java.collection;

import java.util.HashMap;
import java.util.Map;

public class MapCode {
	//Main driver method
	public static void main(String[] args) {
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

