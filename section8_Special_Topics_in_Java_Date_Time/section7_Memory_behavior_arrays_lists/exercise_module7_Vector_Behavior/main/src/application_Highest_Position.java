package exercise_module7_Vector_Behavior.main.src;

import java.util.Locale;
import java.util.Scanner;

public class application_Highest_Position {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, posmaior;
	    double maior;
		
		System.out.print("How many numbers will you enter?");
	    n = sc.nextInt();
		
	    double[] vect = new double[n]; 
		
		for (int i = 0; i < n; i++) {
			System.out.print("Enter a number: ");
			vect[i] = sc.nextDouble();
		}
		
		maior = vect[0];
		posmaior = 0;
		
		
		for (int i = 0; i < n; i++) {
			if (vect[i] > maior) {
				maior = vect[i];
				posmaior = i;
			}
		}
		
		System.out.println();
	    System.out.printf("MAIOR VALOR = %.1f\n", maior);
	    System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posmaior);
	    
        sc.close();
	}

}
