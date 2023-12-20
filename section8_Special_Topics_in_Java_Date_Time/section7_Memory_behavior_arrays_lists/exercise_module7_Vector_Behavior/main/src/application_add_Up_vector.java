package exercise_module7_Vector_Behavior.main.src;

import java.util.Locale;
import java.util.Scanner;

public class application_add_Up_vector {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many numbers will you enter? ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Enter a number: ");
			vect[i] = sc.nextDouble();
		}
		
		double sum = 0;
	    for (int i=0; i<n; i++) {
	        sum = sum + vect[i];
	    }

	    double media = sum / n;

	    System.out.println();
	    System.out.print("VALORES = ");

	    for (int i=0; i<n; i++) {
	    	System.out.printf("%.1f  ", vect[i]);
	    }
        
	    System.out.printf("\nSOMA = %.2f\n", sum);
	    System.out.printf("MEDIA = %.2f\n", media);
		
		
		
		
		sc.close();
		
	}

}