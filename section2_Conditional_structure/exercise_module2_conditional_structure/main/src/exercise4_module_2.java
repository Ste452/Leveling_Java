package section5_Conditional_structure.exercise_module2_conditional_structure.main.src;

import java.util.Locale;
import java.util.Scanner;

public class exercise4_module_2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int horaInicial = sc.nextInt();
		int horaFinal =sc.nextInt();
		
		int duracao;
		if (horaInicial < horaFinal) {
			duracao = horaFinal + horaInicial;
		}else{
			duracao = 24 - horaFinal + horaInicial;
		}
		
		System.out.println("O JOGO DUROU: " + duracao + "hora(s)");
		
		sc.close();
	}
  
}
