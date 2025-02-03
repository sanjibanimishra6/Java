package com.wipro.java.oops;
/* 
 * Animal POJO
 * rules:
 * No constructors
 * getters have return value
 * setters have no return value
 * properties are determined using private fields
 * values or behaviors are determined through setters
 * toString will convert the entire animal class with properties and behaviors
 * */
public class Animal {
	//private fields
private  String animal_name; //stores the animal name
private String species; //stores the animal's species
private int  no_of_herbivores; // stores the count of herbivorous animals


 //getter for animal name
public String getAnimal_name() {
	return animal_name;
}
//setter for animal name
public void setAnimal_name(String animal_name) {
	this.animal_name = animal_name;
}
public String getSpecies() {
	return species;
}
public void setSpecies(String species) {
	this.species = species;
}
public int getNo_of_hervivores() {
	return no_of_herbivores;
}

public void setNo_of_hervivores(int no_of_herbivores) {
	this.no_of_herbivores = no_of_herbivores;
}

}
