package com.wipro.java.oops;
/* 
 * Creating a POJO for Employee Class 
 * 
 * 
 * 
 * */
public class Employee{
private int emp_no; // stores the Employee number
private String emp_name; //stores the Employee name
private String email_ID; // stores the Email ID
private float salary; // stores the salary of the employee
public int getEmp_no() {
	return emp_no;
}
public void setEmp_no(int emp_no) {
	this.emp_no = emp_no;
}
public String getEmp_name() {
	return emp_name;
}
public void setEmp_name(String emp_name) {
	this.emp_name = emp_name;
}
public String getEmail_ID() {
	return email_ID;
}
public void setEmail_ID(String email_ID) {
	this.email_ID = email_ID;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}


}
