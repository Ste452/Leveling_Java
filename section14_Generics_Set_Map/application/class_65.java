package section14_Generics_Set_Map.application;

import java.util.ArrayList;
import java.util.List;

import section14_Generics_Set_Map.model.entities.Circle;
import section14_Generics_Set_Map.model.entities.Rectangle;
import section14_Generics_Set_Map.model.entities.Shape;

public class class_65 {
	
	public static void main(String[] args) {
		
		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Rectangle(3.0, 2.0));
		myShapes.add(new Circle(2.0));
		
		List<Circle> myCircles = new ArrayList<>();
		myCircles.add(new Circle(2.0));
		myCircles.add(new Circle(3.0));
		
		System.out.println("Total area: " + totalArea(myCircles));
	}
	
	public static double totalArea(List<? extends Shape> list) { 
		double sum = 0.0;
		for (Shape s : list) {
			sum += s.area();
		}
		return sum;
	}
}
