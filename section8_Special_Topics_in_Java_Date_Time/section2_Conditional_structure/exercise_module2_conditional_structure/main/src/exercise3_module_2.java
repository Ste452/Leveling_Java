package section5_Conditional_structure.exercise_module2_conditional_structure.main.src;

import java.util.Locale;
import java.util.Scanner;

public class exercise3_module_2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		int N;
		N = sc.nextInt();
		if (N % 2 == 0) {
			System.out.println("PAR");
		}else{
			System.out.println("IMPAR");
		}
		sc.close();
	}

}
