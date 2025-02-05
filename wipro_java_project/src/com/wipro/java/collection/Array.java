package com.wipro.java.collection;

public class Array {


 public static void main(String[] args) {
		
  int []arr;
//allocating memory for 5 integers
   arr = new int[5];
  arr[0] = 10;
  arr[0] = 20;
  arr[0] = 30;
  arr[0] = 40;
  arr[0] = 50;

//accessing elements from the specified array
for(int i = 0; i < arr.length;i++) {
	System.out.println("Element at index " + i + ":" + arr[i]);
}
	
}
}


