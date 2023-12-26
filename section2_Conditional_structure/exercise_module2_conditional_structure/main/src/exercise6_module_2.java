package section2_Conditional_structure.exercise_module2_conditional_structure.main.src;

import java.util.Locale;
import java.util.Scanner;

public class exercise6_module_2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			
			int numero = sc.nextInt();
			if (numero < 0 || numero > 100) {
				System.out.println("Fora de intervalo");
			}else if (numero <= 25){
				System.out.println("Intervalo (0, 25]");
			}else if (numero <= 50) {
				System.out.println("Intervalo (25, 50]");
			}else if (numero <= 75) {
				System.out.println("Intervalo (50, 75]");
			}else {
				System.out.println("Intervalo (75, 100]");
			}	
		sc.close();
	}

}
