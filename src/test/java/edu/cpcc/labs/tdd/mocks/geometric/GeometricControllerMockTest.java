package edu.cpcc.labs.tdd.mocks.geometric;

import static org.junit.jupiter.api.Assertions.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(MockitoExtension.class)
class GeometricControllerMockTest {

	@Mock
	GeometricCalculator calculator;
	
	@Mock
	Drawable drawable;
	
	@Mock
	Rotatable rotatable;
	
	@InjectMocks
	GeometricController controller;
	
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
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

	
	@Test
	void testGeometricControllerWithMocks() {
		assertNotNull(calculator);
		assertNotNull(drawable);
		assertNotNull(rotatable);
		
		Double radius = 10.0;
		Double expectedArea = Math.PI * Math.pow(radius, 2);
		String expectedDrawableReponse="I am drawing a circle";
		String expectedRotatableResponse = "I am rotating myself";
		
		when(calculator.areaOfCircle(radius)).thenReturn(expectedArea);
		when(drawable.draw()).thenReturn(expectedDrawableReponse);
		when(rotatable.rotate()).thenReturn(expectedRotatableResponse);
		
		Double recivedArea  = controller.areaOfCircle(radius);
		assertEquals(expectedArea, recivedArea);
		
		String recivedDrableResponse = controller.draw();
		
		assertEquals(expectedDrawableReponse, recivedDrableResponse);
		
		String receivedRotatableResponse = controller.rotate();
		assertEquals(expectedRotatableResponse,  receivedRotatableResponse);
		
	}

}
