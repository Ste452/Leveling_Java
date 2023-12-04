package exercise_module5_Introduction_to_object_oriented_programming.main.src;

import java.util.Locale;
import java.util.Scanner;

import exercise_module5_Introduction_to_object_oriented_programming.entities.Rectangle;

public class application_Rectangle {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		Rectangle rect = new Rectangle();
		
		System.out.println("Enter rectangle width and height: ");
		rect.width = sc.nextDouble();
		rect.height = sc.nextDouble();
		
		System.out.printf("Area = %.2f%n", rect.area());
		System.out.printf("Perimeter = %.2f%n", rect.perimeter());
		System.out.printf("Diagonal = %.2f%n", rect.diagonal());
		
        sc.close();
	}

}
