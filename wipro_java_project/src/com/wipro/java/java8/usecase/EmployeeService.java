package com.wipro.java.java8.usecase;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeeService {
private List<Employee> employees = new ArrayList<>();
// Add an Employee
public void addEmployee(Employee emp) {
employees.add(emp);
System.out.println("Employee added: " + emp);
}
// Remove an Employee by ID
public void removeEmployee(int id) {
employees.removeIf(emp -> emp.getId() == id);
System.out.println("Employee with ID " + id + " removed.");
}
// Search Employee by ID
public Optional<Employee> searchEmployee(int id) {
return employees.stream()
.filter(emp -> emp.getId() == id)
.findFirst();
}
// Update Employee Salary
public void updateSalary(int id, double newSalary) {
employees.stream()
.filter(emp -> emp.getId() == id)
.findFirst()
.ifPresent(emp -> emp.setSalary(newSalary));
}
// Display All Employees
public void displayEmployees() {
employees.forEach(System.out::println);
}
// Filter Employees by Department
public List<Employee> filterByDepartment(String department) {
return employees.stream()
.filter(emp -> emp.getDepartment().equalsIgnoreCase(department))
.collect(Collectors.toList());
}
// Sort Employees by Name
public List<Employee> sortByName() {
return employees.stream()
.sorted(Comparator.comparing(Employee::getName))
.collect(Collectors.toList());
}
// Get Average Salary
public double getAverageSalary() {
return employees.stream()
.mapToDouble(Employee::getSalary)
.average()
.orElse(0.0);
}
}