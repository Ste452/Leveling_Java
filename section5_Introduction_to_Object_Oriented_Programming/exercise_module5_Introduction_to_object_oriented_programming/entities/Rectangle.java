package section5_Introduction_to_Object_Oriented_Programming.exercise_module5_Introduction_to_object_oriented_programming.entities;

public class Rectangle {

	public double width;
	public double height;

	public double area() {
		return width * height;
	}

	public double perimeter() {
		return 2 * (width + height);
	}

	public double diagonal() {
		return Math.sqrt(width * width + height * height);
	}
}
