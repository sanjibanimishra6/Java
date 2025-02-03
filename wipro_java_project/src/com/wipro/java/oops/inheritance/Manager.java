/**
 * 
 */
package com.wipro.java.oops.inheritance;

/**
* Parent class = Employee
 * Child class = Manager
 * keyword = extends
 */
public class Manager extends Employee {

	/**
	 * 
	 */
	public Manager() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		//Child object is instantiated from child constructor
		// Parent class consumes properties and behavior
		
		Employee emp = new  Manager();
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
