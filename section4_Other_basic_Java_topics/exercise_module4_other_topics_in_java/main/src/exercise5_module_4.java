package section4_Other_basic_Java_topics.exercise_module4_other_topics_in_java.main.src;

import java.util.Locale;
import java.util.Scanner;

public class exercise5_module_4 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor N: ");
        int n = scanner.nextInt();

        // Verifique se n é não negativo
        if (n < 0) {
            System.out.println("O fatorial não está definido para números negativos.");
        } else {
            long fatorial = calcularFatorial(n);
            System.out.println("O fatorial de " + n + " é " + fatorial);
        }

        scanner.close();
    }

    public static long calcularFatorial(int n) {
        if (n == 0) {
            return 1; // Por definição, o fatorial de 0 é 1.
        }

        long fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }

        return fatorial;
        
    }
}