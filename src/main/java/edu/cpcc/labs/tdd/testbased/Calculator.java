package edu.cpcc.labs.tdd.testbased;

public class Calculator {
   public double divide (double num1, double num2){
	   
	   if (num2 == 0) {
		   throw new  ArithmeticException();
	   }
	   return num1/num2;
   }
   
public int divide (int num1, int num2){
	   
	   if (num2 == 0) {
		   throw new  ArithmeticException();
	   }
	   return num1/num2;
   }
}
