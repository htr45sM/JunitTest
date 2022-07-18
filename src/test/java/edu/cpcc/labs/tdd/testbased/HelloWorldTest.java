package edu.cpcc.labs.tdd.testbased;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class HelloWorldTest {
	HelloWorld hello = null;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		hello = new HelloWorld();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	//TO disable the test use @Disabled
	//@Disabled
	@Test
	@DisplayName("Testing happy path")
	void test() {

		//Create instance of data
		//HelloWorld hello = new HelloWorld();

		//Set up process
		String myExpectedSalutation="Hello Joe";

		//Execute the test
		String recivedSalutation = hello.sayHelloTo("Joe");

		//Compare expected value with recived value ....
		assertEquals(myExpectedSalutation, recivedSalutation, "Expected and received must match");
	}

	//TO disbale the test use @Disabled
	//@Disabled
	@DisplayName("Testing null inputs")
	@Test
	void testForNull() {

		//Create instance of data
		//HelloWorld hello = new HelloWorld();

		//Set up process
		String personName= null;


		//Checking if method throws exception when data passing is invalid ....
		//Second argument is lambda function which is executable code
		assertThrows(NullPointerException.class, () -> hello.sayHelloTo(personName));
	}


}
