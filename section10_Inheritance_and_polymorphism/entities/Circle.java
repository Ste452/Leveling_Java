package section13_Inheritance_and_polymorphism.entities;

import section13_Inheritance_and_polymorphism.enums.Color;

public class Circle extends Shape {
	
	private static Double radius;
	
	public Circle() {
		super();
	}
	
	public Circle(Color color, Double radius) {
		super(color);
		Circle.radius = radius;
	}

	public static Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		Circle.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}

}
