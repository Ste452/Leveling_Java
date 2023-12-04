package section13_Inheritance_and_polymorphism;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import section13_Inheritance_and_polymorphism.entities.Circle;
import section13_Inheritance_and_polymorphism.entities.Rectangle;
import section13_Inheritance_and_polymorphism.entities.Shape;
import section13_Inheritance_and_polymorphism.enums.Color;

public class class_45 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Shape> list = new ArrayList<>();
		
	    System.out.print("Enter the number of shapes:");
		int n = sc.nextInt();
	    
		for (int i = 0; i < n; i++) {
			System.out.println("Shape #" + i + " data:");
			System.out.print("\nRectangle or Circle (r/c)?");
			char ch = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED):");
			Color color =  Color.valueOf(sc.next());
			
			if (ch == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				list.add(new Rectangle(color, width, height));
			}
			else {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				list.add(new Circle(color, radius));
			}
		}
		
		System.out.println();
		System.out.println("SHAPE AREAS:");
		for (Shape shape : list) {
			System.out.println(String.format("%.2f", shape.area()));
		}
		
		sc.close();
	}

}
