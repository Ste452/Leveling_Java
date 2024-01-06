package section7_Memory_behavior_arrays_lists.exercise_module7_Vector_Behavior.main.src;

import java.util.Scanner;

public class application_Pair_numbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n, qtdpares;

	    System.out.print("Quantos numeros voce vai digitar? ");
	    n = sc.nextInt();

	    int[] vetor = new int[n];

	    for (int i=0; i<n; i++) {
	    	System.out.print("Digite um numero: ");
	        vetor[i] = sc.nextInt();
	    }

	    System.out.println("\nNUMEROS PARES:");

		qtdpares = 0;
	    for (int i=0; i<n; i++) {
	        if (vetor[i] % 2 == 0) {
	        	System.out.printf("%d  ", vetor[i]);
	            qtdpares++;
	        }
	    }

	    System.out.printf("\n\nQUANTIDADE DE PARES = %d\n", qtdpares);

		sc.close();
	}

}
