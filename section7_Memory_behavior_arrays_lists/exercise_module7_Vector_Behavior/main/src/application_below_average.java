package section7_Memory_behavior_arrays_lists.exercise_module7_Vector_Behavior.main.src;

import java.util.Locale;
import java.util.Scanner;

public class application_below_average {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;
		double sum, media;

		System.out.print("How many elements will be have in the vect? ");
		n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Enter a number: ");
			vect[i] = sc.nextDouble();
		}

		sum = 0.0;

		for (int i = 0; i < n; i++) {
			sum += vect[i];
		}

		media = sum / n;
		
		System.out.println();
		System.out.printf("Vect Average:  %.3f\n", media);

		for (int i = 0; i < n; i++) {
			if (vect[i] < media) {
				System.out.printf("%.1f\n", vect[i]);
			}
		}
		sc.close();
	}

}
