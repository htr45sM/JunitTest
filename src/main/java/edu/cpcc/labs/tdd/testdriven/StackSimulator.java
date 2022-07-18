package edu.cpcc.labs.tdd.testdriven;

import edu.cpcc.labs.tdd.exception.StackException;

public class StackSimulator {
	private static final int STACK_SIZE = 5;
	
	private Integer[] intArr;
	private int stackPosition;
	
	StackSimulator(){
		intArr = new Integer[STACK_SIZE];
		stackPosition = -1;
	}

	public void push(int val) {	
		stackPosition++;
		
		if (stackPosition > STACK_SIZE - 1) {
			throw new StackException("Stack is full.");
		}
		
		intArr[stackPosition] = val;
	}

	public int peek() {
		if (stackPosition < 0 ) {
			throw new StackException("Stack is empty");		
		}
		
		return intArr[stackPosition];
	}

	public int pop() {
		int poppedVal ;
		
		if (stackPosition < 0 ) {
			throw new StackException("Stack is empty");		
		}
		
		poppedVal = intArr[stackPosition];
		intArr[stackPosition] = -Integer.MIN_VALUE;
		stackPosition--;
		
		return poppedVal;	
	}

}
