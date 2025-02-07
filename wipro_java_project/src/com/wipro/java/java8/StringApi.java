package com.wipro.java.java8;
public class StringApi {

	public static void main(String[] args) {
		String str = "Sanjibani Yellow Mishra";
		System.out.println(str.length());
		System.out.println(str.charAt(2));
		System.out.println(str.substring(1,3));
		System.out.println(str.contains("a"));
		String[] ar= str.split(" ");
		for(String str1:ar) {
			System.out.println(str1);
		}
	}
}


