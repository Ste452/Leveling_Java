package section7_Memory_behavior_arrays_lists.exercise_module7_Vector_Behavior.main.src;

import java.util.Locale;
import java.util.Scanner;

public class application_Integer_Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many numbers will you write? ");
		int n = sc.nextInt();

		int[] vect = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Enter a number: ");
			vect[i] = sc.nextInt();
		}

		System.out.println("Negative numbers: ");

		for (int i = 0; i < n; i++) {
			if (vect[i] < 0) {
				System.out.println();
				System.out.printf("%d\n", vect[i]);
			}
		}
		
		sc.close();

	}
}