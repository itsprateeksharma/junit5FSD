package testcode;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumingThat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import businesscode.Calculator;
/*
 * In Junit 5, test classes and test methods can declare 
 * custom display names via Junit 5 @DisplayName annotation.
 */


@DisplayName("Calculator Test Case")
class Calculator5Test {
	
	//create an obj of class to be tested
	Calculator cal;
	
	@BeforeEach
	void setUp() throws Exception {
		cal=new Calculator();
	}

	@AfterEach
	void tearDown() throws Exception {
		cal=null;
	}

	@Test
	@DisplayName("Calculator Add test")
	void testAdd() {
		double result=cal.add(10.50, 10.32);
		assertEquals(20.82, result,0);
	}

	@Test
	@DisplayName("Calculator Subtract test")
	void testSubtract() {
		double result=cal.subtract(100.5, 95);
		assertEquals(5.5, result,0);
	}

	@Test
	@DisplayName("Calculator Multiply test")
	void testMultiply() {
		//double result=cal.multiply(100,2.5);
		
		String user="gosling";
		assumingThat(user.equals("gosling"), ()->assertEquals(500, 2.5,0));
	
	}

	@Test
	void testDivide() {
		double result=cal.divide(100, 10);
		assertEquals(10, result,0);
	}

}
