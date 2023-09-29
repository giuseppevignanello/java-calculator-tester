package org.java;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTester {
	
	private Calculator calculator;
	
	@BeforeEach 
	public void beforeEach() {
		calculator = new Calculator();

	}
	
	@Test 
	@DisplayName("Test add operation")
	public void addOperation() {
		float result = calculator.add(10, 20);
		
		assertEquals(30, result);
	}
	
	@Test 
	@DisplayName("Test substract operation")
	public void substractOperation() {
		float result = calculator.subtract(20, 10);
		
		assertEquals(10, result);
	}
	
	@Test 
	@DisplayName("Test multiplication operation")
	public void multiplicationOperation() {
		float result = calculator.multiply(20, 10);
		
		assertEquals(200, result);
	}
	
	@Test 
	@DisplayName("Test division operation")
	public void divisionOperation() throws Exception {
		float result = calculator.divide(37, 3);
		
		assertEquals( 37f / 3f, result);
	}
	
	@Test 
	@DisplayName("Test division by zero")
	public void divisionByZero() {
		assertThrows(Exception.class, () -> calculator.divide(5, 0), "You can't divide by 0");
	}
	
	
	
}
