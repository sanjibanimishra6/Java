package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 
 */
public class Animal implements Comparable<Animal> {
private String name; //animals name
private int age; //age
//Constructor
public Animal(String name , int age){
	this.name = name;
	this.age = age;
}
//Implementation of the CompareTo method
//Default sorting of age

@Override
public int compareTo(Animal a) {
	// TODO Auto-generated method stub
	return this.age - a.age; 
}
//getters
public String getName() {
	return name;
}

public int getAge() {
	return age;
}

//main method
	public static void main(String[] args) {
		ArrayList<Animal> a1 = new ArrayList<>();
		a1.add(new Animal ("Dog" ,15));
		a1.add(new Animal("Lion", 19));
		a1.add(new Animal ("Cat" , 8));
		//Sort the age
		Collections.sort(a1);
		for(Animal a : a1) {
			System.out.println(a.getName() +" "+  a.getAge());
		}
	}
	
	}
	


