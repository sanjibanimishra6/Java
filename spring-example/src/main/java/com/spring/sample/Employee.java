package com.spring.sample;

public class Employee {
private int id;
private String name;
private String city;

public int getId() {
	return id;
}
void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}
public void setName(String name) {
	name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
void display(){  
    System.out.println(id+" "+name+" "+city);  
}  
}
