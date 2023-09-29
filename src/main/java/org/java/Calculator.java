package org.java;

public class Calculator {
	
	public Calculator() {
		
	}
	
	float add (float num1, float num2) {
		float result = num1 + num2;
		return result;
	} 
	
	float subtract(float num1, float num2) {
		float result = num1 - num2; 
		return result;
	}
	float multiply(float num1, float num2) {
		float result = num1 * num2;
		return result;
	}
	float divide(float num1, float num2) throws Exception {
		if(num2 == 0) {
			throw new Exception("You can't divide by 0");
		}
		float result = num1 / num2;
		return result;
	}
}
