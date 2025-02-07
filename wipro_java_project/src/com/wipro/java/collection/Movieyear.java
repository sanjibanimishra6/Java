package com.wipro.java.collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Movieyear implements Comparator<Movie1> {

public int compare(Movie1 m1 , Movie1 m2) {
	//Sort by year in descending order
	return  Integer.compare(m1.getY(), m2.getY());

}
public static void main(String[]args) {
	//Create list of movies
	ArrayList<Movie1> m1 = new ArrayList<>();
	m1.add(new Movie1("Star wars" , 8.7, 1977));
	m1.add(new Movie1 ("Empire Strikes Back" , 8.8, 1980));
	m1.add(new Movie1 ("Return to the Jedi" , 8.4, 1983));
	// Sort movies by rating and display all
	Collections.sort(m1,new Rating());
	System.out.println("Movies sorted by rating");
	for(Movie1 m : m1) {
		System.out.println(m.getN()+ " " + m.getR()+" "+m.getY());
	}
	// Sort movies by names and display all
	Collections.sort(m1,new Name());
	System.out.println("Movies sorted by name");
	for(Movie1 m : m1) {
		System.out.println(m.getN()+ " " + m.getR()+" "+m.getY());
	}
	//Sort movies by years and display all
	Collections.sort(m1,new Movieyear());
	System.out.println("Movies sorted by Year");
	for(Movie1 m : m1) {
		System.out.println(m.getN()+ " " + m.getR()+" "+m.getY());
}}}


