package com.wipro.java.collection;

	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Comparator;
	public class AnimalName implements Comparator<Animal1> {

	public int compare(Animal1 a1 , Animal1 a2) {
		//Sort by rating in descending order
		return  a1.getName().compareTo(a2.getName());

	}
	public static void main(String[]args) {
		//Create list of movies
		ArrayList<Animal1> aa = new ArrayList<>();
		aa.add(new Animal1 ("Dog" ,15));
		aa.add(new Animal1("Lion", 19));
		aa.add(new Animal1 ("Cat" , 8));
		// Sort Animals by age and display all
		Collections.sort(aa,new AnimalAge());
		System.out.println("Animals sorted by age");
		for(Animal1 a : aa) {
			System.out.println(a.getName() +" "+  a.getAge());
		}
		// Sort Animals by names and display all
		Collections.sort(aa,new AnimalName());
		System.out.println("Animals sorted by name");
		for(Animal1 a : aa) {
			System.out.println(a.getName() +" "+  a.getAge());
	}}}
