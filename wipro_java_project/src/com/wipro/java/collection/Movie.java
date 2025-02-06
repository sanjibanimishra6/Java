/**
 * 
 */
package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 
 */
public class Movie implements Comparable<Movie> {
private String n; //Movie Name
private double r; //Movie rating
private int y; // Release year of the movie
//Constructor
public Movie(String n , double r, int y){
	this.n = n;
	this.r = r;
	this.y = y;
}
//Implementation of the CompareTo method
//Default sorting of the ratings


	@Override
	public  int compareTo(Movie m) {
		
		return Double.compare(this.r, m.r);
	}


	/**
	 * @return the n
	 */
	public String getName() {
		return n;
	}


	public double getRating() {
		return r;
	}

	public int getYear() {
		return y;
	}


	
	public static void main(String[] args) {
		ArrayList<Movie> l = new ArrayList<>();
		l.add(new Movie ("Star wars" , 8.7, 1977));
		l.add(new Movie ("Empire Strikes Back" , 8.8, 1980));
		l.add(new Movie ("Return to the Jedi" , 8.4, 1983));
		//Sort the ratings of the movies using comparable
		Collections.sort(l);
		for(Movie m : l) {
			System.out.println(m.getName() +" "+ m.getRating()+"  " + m.getYear());
		}
	}
	

}
