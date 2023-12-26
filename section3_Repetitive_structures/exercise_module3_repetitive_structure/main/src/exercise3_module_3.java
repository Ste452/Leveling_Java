package section3_Repetitive_structures.exercise_module3_repetitive_structure.main.src;

import java.util.Scanner;

public class exercise3_module_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    
        getPreferredProductsFromCustomers();

        sc.close(); // Fechar o Scanner principal
    }

    private static void getPreferredProductsFromCustomers() {

        Scanner sc = new Scanner(System.in);
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        int tipo = sc.nextInt();

        while (tipo != 4) {
            if (tipo == 1) {
                alcool++;
            } else if (tipo == 2) {
                gasolina++;
            } else if (tipo == 3) {
                diesel++;
            }
            tipo = sc.nextInt();
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Álcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
	}

}
