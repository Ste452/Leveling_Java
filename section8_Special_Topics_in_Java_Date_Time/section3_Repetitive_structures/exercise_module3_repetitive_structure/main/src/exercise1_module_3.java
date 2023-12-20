package section6_Repetitive_structures.exercise_module3_repetitive_structure.main.src;

import java.util.Scanner;

public class exercise1_module_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        getPassword();

        sc.close(); // Fechar o Scanner principal
    }

    private static void getPassword() {

        Scanner sc = new Scanner(System.in);
        int senha1 = sc.nextInt();
        while (senha1 != 2002) {
            System.out.println("Senha Invalida");
            senha1 = sc.nextInt();
        }

        System.out.println("Acesso Permitido");
        sc.close();
    }

}
