/**
 * 
 */
package com.wipro.java.oops;

/**
 * Parent class = Employee
 * Child class = Developer
 * keyword = extends
 */
public class Developer extends Employee {

	/**
	 * 
	 */
	public Developer() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		//Child object is instantiated from child constructor
		// Parent class consumes properties and behavior
		
		Employee emp = new  Developer();
		emp.setEmp_no(1234);
		emp.setEmail_ID("sanjibani@gmail.com");
		emp.setEmp_name("Sanjibani");
		emp.setSalary(50000f);
		System.out.println(emp.getEmp_name());
		System.out.println(emp.getEmail_ID());
		System.out.println(emp.getEmp_no());
		System.out.println(emp.getSalary());
	}


}
