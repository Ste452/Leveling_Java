package section7_Memory_behavior_arrays_lists.exercise_module7_Vector_Behavior.main.src;

import java.util.Locale;
import java.util.Scanner;

public class application_sum_Vectors {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
	
		System.out.print("How many values will each vector have? ");
		
		int n = sc.nextInt();
		
		int[] vectA = new int[n];
		int[] vectB = new int[n];
		int[] vectC = new int[n];
		System.out.println("Enter the values of vector A: ");
		
		for (int i = 0; i < n; i++) {
			vectA[i] = sc.nextInt();
		}
		
		System.out.println("Enter the values of vector B: ");
		for (int i = 0; i < n; i++) {
			vectB[i] = sc.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			vectC[i] = vectA[i] + vectB[i];
		}
		
		System.out.println("Resulting vector:");
		
		for (int i = 0; i < n; i++) {
			System.out.printf("%d\n", vectC[i]);
		}
		
		sc.close();
	}

}
