package edu.cpcc.labs.tdd.testdriven;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class GeometricCalculatorTest {

	static GeomertricCalculator gCalc = null;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		gCalc = new GeomertricCalculator();
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

	@DisplayName("Tesing area of circle using happy path")
	@Test
	void AreaOfCircleTest() {
		double raduis = 5.0;
		double pi = Math.PI;
		
		double expectedValue =  pi * Math.pow(raduis, 2);
		double result = gCalc.areaOfCircle(raduis); 
		
		assertEquals(expectedValue, result);
	}
	
	@DisplayName("Tesing area of triangle using happy path")
	@Test
	void AreaOfTriangleTest() {
		
		Double base = 10.0;
		Double height = 10.0;
		
		Double ExpectedArea = 0.5 * base * height;
		
		Double result = gCalc.areaOfTriangle(base, height);
				
		assertEquals(ExpectedArea, result);
		
	}

}
