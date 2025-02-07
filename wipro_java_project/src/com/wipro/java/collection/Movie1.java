/**
 * 
 */
package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * 
 */
public class Movie1{
	private String n; //Movie Name
	private double r; //Movie rating
	private int y; // Release year of the movie

	public Movie1(String n ,double r,int y) {
	this.n = n;
	this.r = r;
	this.y = y;
	}
	//getter methods

	public String getN() {
		return n;
	}

	public double getR() {
		return r;
	}
	public int getY() {
		return y;
	}
	
	
	}


