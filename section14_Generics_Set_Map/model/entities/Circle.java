package section14_Generics_Set_Map.model.entities;

public class Circle implements Shape {
	
	private double radius;
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}


	public double area() {
		return Math.PI * radius * radius; 
	}
}
