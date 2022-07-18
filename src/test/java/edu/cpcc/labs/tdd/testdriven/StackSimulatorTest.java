package edu.cpcc.labs.tdd.testdriven;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import edu.cpcc.labs.tdd.exception.StackException;

class StackSimulatorTest {
	StackSimulator stack ;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		stack = new StackSimulator();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@DisplayName("Testing push to stack. popped value must match pushed value.")
	@Test
	void pushTest() {
		int val = 5;
		int expectedValue = 5;

		stack.push(val);

		int result = stack.peek();
		assertEquals(expectedValue, result);	
	}

	@DisplayName("Testing push to fill stack. Exception testing limit of stack.")
	@Test
	void pushTillFullTest() {
		int val = 5;

		stack.push(val);
		stack.push(val);
		stack.push(val);
		stack.push(val);
		stack.push(val);

		assertThrows( StackException.class, () -> stack.push(val));	
	}

	@DisplayName("Testing pop from stack. popped value must match value on top of stack.")
	@Test
	void popTest() {
		int val = 5;
		int expectedValue = 5;

		stack.push(val + 4);
		stack.push(val);

		int result = stack.pop();
		assertEquals(expectedValue, result);	
	}


	@DisplayName("Testing pop from empty stack. Throws Exception")
	@Test
	void popInitialTest() {
		assertThrows( StackException.class, () -> stack.pop());
	}


	@DisplayName("Testing pop until stack gets empty. Throws Exception.")
	@Test
	void popTillEmptyTest() {
		int val = 5;

		stack.push(val);
		stack.pop();

		assertThrows( StackException.class, () -> stack.pop());	
	}

	@DisplayName("Testing peek from stack. The return value should be the same as value in top of stack ")
	@Test
	void peekTest() {
		int val = 7;
		int expectedValue = 7;

		stack.push(val + 6);
		stack.push(val);

		int result = stack.peek();
		assertEquals(expectedValue, result);	
	}

	@DisplayName("Testing Peek on empty stack. Throws Exception.")
	@Test
	void peekEmptyStackTest() {
		assertThrows( StackException.class, () -> stack.peek());	
	}



}
