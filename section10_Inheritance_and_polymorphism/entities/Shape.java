package section10_Inheritance_and_polymorphism.entities;

import section10_Inheritance_and_polymorphism.enums.Color;

public abstract class Shape {
	private Color color;

	public Shape() {
		
	}
	
	public Shape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	public abstract double area();
}
