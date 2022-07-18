package edu.cpcc.labs.tdd.testdriven;

public class GeomertricCalculator {

	public Double areaOfTriangle(Double base, Double height) {
		if (base < 0.0 || height < 0.0) {
			throw new ArithmeticException();
		}
		
		return 0.5 * base * height;
	}

	public double areaOfCircle(double radius) {
		if (radius < 0.0) {
			throw new ArithmeticException();
		}
		return Math.PI * Math.pow(radius, 2);
	}

}
