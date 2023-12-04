package exercise_module7_Vector_Behavior.main.src;

import java.util.Locale;
import java.util.Scanner;

public class application_people_data {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, qtdhomens, qtdmulheres;
		double menoraltura, maioraltura, alturafemMedia, alturafemtotal, alturaManMedia, alturaMantotal;

		System.out.print("Quantas pessoas serao digitadas? ");
		n = sc.nextInt();

		double[] alturas = new double[n];
		char[] generos = new char[n];

		for (int i = 0; i < n; i++) {
			System.out.printf("Altura da %da pessoa: ", i + 1);
			alturas[i] = sc.nextDouble();
			System.out.printf("Genero da %da pessoa: ", i + 1);
			generos[i] = sc.next().charAt(0);
		}

		menoraltura = alturas[0];
		maioraltura = alturas[0];

		for (int i = 1; i < n; i++) {
			if (alturas[i] > maioraltura) {
				maioraltura = alturas[i];
			}
			if (alturas[i] < menoraltura) {
				menoraltura = alturas[i];
			}
		}

		qtdhomens = 0;
		alturaManMedia = 0;
		alturaMantotal = 0;
		qtdmulheres = 0;
		alturafemtotal = 0;
		for (int i = 0; i < n; i++) {
			if (generos[i] == 'M') {
				qtdhomens++;
				alturaMantotal += alturas[i];
			} else {
				qtdmulheres++;
				alturafemtotal += alturas[i];
			}
		}

		alturafemMedia = alturafemtotal / qtdmulheres;
		alturaManMedia = alturaMantotal / qtdhomens;

		System.out.println();
		System.out.printf("Menor altura = %.2f\n", menoraltura);
		System.out.printf("Maior altura = %.2f\n", maioraltura);
		System.out.printf("Numero de mulheres = %d\n", qtdmulheres);
		System.out.printf("Media das alturas das mulheres = %.2f\n", alturafemMedia);
		System.out.printf("Numero de homens = %d\n", qtdhomens);
		System.out.printf("Media das alturas dos homens = %.2f\n", alturaManMedia);

		sc.close();
	}

}
