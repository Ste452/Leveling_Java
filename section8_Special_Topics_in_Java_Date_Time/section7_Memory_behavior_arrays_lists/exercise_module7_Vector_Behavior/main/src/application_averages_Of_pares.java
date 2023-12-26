package exercise_module7_Vector_Behavior.main.src;

import java.util.Locale;
import java.util.Scanner;

public class application_averages_Of_pares {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, npares = 0, sumPares= 0;
		double mediaPares;
		
		System.out.print("How many elements will be have in the vect? ");
		n = sc.nextInt();
		
		int[] vect = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Enter a number: ");
			vect[i] = sc.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			if (vect[i] % 2 == 0) {
				sumPares +=  vect[i];
				npares++;
			}
		}
		
		if (npares == 0) {
			System.out.println("No even pares numbers");
		}else{
			mediaPares = (double) sumPares / npares;
			
			System.out.printf("Average of numbers pares: %.2f%n", mediaPares);
		}
		
		
		
		sc.close();
	}

}
