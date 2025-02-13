package edu.cpcc.labs.tdd.mocks.geometric;

public class GeometricController {
	GeometricCalculator calculator;
	Drawable drawable;
	Rotatable rotatable;

	public GeometricController(GeometricCalculator calculator, 
			Drawable drawable, Rotatable rotatable) {
		this.calculator = calculator;
		this.drawable = drawable;
		this.rotatable = rotatable;
	}

	public Double areaOfCircle(Double radius) {
		return calculator.areaOfCircle(radius);
	}

	public String draw() {
		return drawable.draw();
	}
	
	public String rotate() {
		return rotatable.rotate();
	}
}
