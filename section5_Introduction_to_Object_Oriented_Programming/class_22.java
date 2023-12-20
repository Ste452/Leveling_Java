package section8_Introduction_to_Object_Oriented_Programming;
import java.util.Locale;
import java.util.Scanner;

import section8_Introduction_to_Object_Oriented_Programming.util.Calculator_class21;

public class class_22 {

	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = Calculator_class21.circumference(radius);
		
		double v = Calculator_class21.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculator_class21.PI);
		
		sc.close();
	}
	
}
