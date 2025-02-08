package com.wipro.java.java8.usecase;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.Optional;

public class EmployeeServiceTest {
    private EmployeeService employeeService;

    @Before
    public void setUp() {
        employeeService = new EmployeeService();
        employeeService.addEmployee(new Employee(1, "Alice", "IT", 50000, LocalDate.of(2020, 5, 10)));
        employeeService.addEmployee(new Employee(2, "Bob", "HR", 45000, LocalDate.of(2019, 3, 15)));
        employeeService.addEmployee(new Employee(3, "Charlie", "Finance", 60000, LocalDate.of(2021, 8,
        		22)));
    }

    @Test
    public void testAddEmployee() {
        Employee newEmp = new Employee(3, "Charlie", "Finance", 60000, LocalDate.of(2021, 8, 22));
        employeeService.addEmployee(newEmp);
        Optional<Employee> result = employeeService.searchEmployee(3);
        assertTrue(result.isPresent());
        assertEquals("Charlie", result.get().getName());
    }

    @Test
    public void testRemoveEmployee() {
        employeeService.removeEmployee(1);
        Optional<Employee> result = employeeService.searchEmployee(1);
        assertFalse(result.isPresent());
    }

    @Test
    public void testSearchEmployee() {
        Optional<Employee> result = employeeService.searchEmployee(2);
        assertTrue(result.isPresent());
        assertEquals("Bob", result.get().getName());
    }

    @Test
    public void testUpdateSalary() {
        employeeService.updateSalary(1, 70000);
        Optional<Employee> result = employeeService.searchEmployee(1);
        assertTrue(result.isPresent());
        assertEquals(70000, result.get().getSalary(), 0.01);
    }
}
