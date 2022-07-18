package edu.cpcc.labs.tdd.testbased;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	static Calculator cal = null;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		//Create instance of data
		cal = new Calculator();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@DisplayName("Tesing Division for double values.")
	@Test
	void divisionDoubleTest() {
		
		//Set up process
		double myExpectedSalutation = 2.0;
		
		//Defining inputs
		double num1 = 4.0;
		double num2 = 2.0;

		//Execute the test
		double recivedSalutation = cal.divide(num1, num2);

		//Compare expected value with received value ....
		assertEquals(myExpectedSalutation, recivedSalutation);
	}
	
	@DisplayName("Tesing Division for double negative values.")
	@Test
	void divisionDoubleNegativeTest() {
		//Set up process
		double myExpectedSalutation = 2.0;
		double num1 = -4.0;
		double num2 = -2.0;

		//Execute the test
		double recivedSalutation = cal.divide(num1, num2);

		//Compare expected value with received value ....
		assertEquals(myExpectedSalutation, recivedSalutation, "Diving two double negative numbers and result should match");
	}

	@DisplayName("Tesing Division for integer values.")
	@Test
	void divisionIntTest() {
		//Set up process
		int myExpectedSalutation=2;
		int num1 = 4;
		int num2 = 2;

		//Execute the test
		double recivedSalutation = cal.divide(num1, num2);

		//Compare expected value with received value ....
		assertEquals(myExpectedSalutation, recivedSalutation, "Diving two int positive numbers and result should matchh");
	}


	//Testing for invalid input to make sure the method throws exception
	@DisplayName("Tesing Division for double using division by 0.")
	@Test
	void divisionDoubleTestForNull() {
		double num1 = 4.0;
		double num2 = 0.0;
		
		//Checking if method throws exception when data passing is invalid ....
		//Second argument is lambda function which is executable code
		assertThrows(ArithmeticException.class, () -> cal.divide(num1, num2));
	}

	//Testing for invalid input to make sure the method throws exception
	@DisplayName("Tesing Division for integer using division by 0.")
	@Test
	void divisionIntTestForNull() {
		int num1 = 4;
		int num2 = 0;

		//Checking if method throws exception when data passing is invalid ....
		//Second argument is lambda function which is executable code
		assertThrows(ArithmeticException.class, () -> cal.divide(num1, num2));
	}
}
