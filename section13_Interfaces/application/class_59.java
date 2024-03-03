package section13_Interfaces.application;

import section13_Interfaces.application.model.entities.AbstractShape;
import section13_Interfaces.application.model.entities.Circle;
import section13_Interfaces.application.model.entities.Rectangle;
import section13_Interfaces.enums.Color;

public class class_59 {

	public static void main(String[] args) {

		AbstractShape s1 = new Circle(Color.BLACK, 2.0);
		AbstractShape s2 = new Rectangle(Color.WHITE, 3.0, 4.0);
		
		System.out.println("Circle color: " + s1.getColor());
		System.out.println("Circle area: " + String.format("%.3f", s1.area()));
		System.out.println("Rectangle color: " + s2.getColor());
		System.out.println("Rectangle area: " + String.format("%.3f", s2.area()));
	}
}