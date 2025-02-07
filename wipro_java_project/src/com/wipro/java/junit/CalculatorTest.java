package com.wipro.java.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
private final Calculator calculator = new Calculator();
@Test
public void testAdd() {
	int result = calculator.add1(3, 2);
assertEquals(5,result);}


@Test
public void testSubtract() {
	int result = calculator.subtract(3, 2);
	assertEquals(1,result);}

public void testAddWithNegativeNumbers() {
	int result = calculator.add1(-5, -2);
assertEquals(-7,result);}

public void testSubtractWithNegativeNumbers() {
	int result = calculator.add1(-7, -2);
assertEquals(-5,result);}


}

