package section2_Conditional_structure.exercise_module2_conditional_structure.main.src;

import java.util.Scanner;
	
import java.util.Locale;
public class exercise1_module_2 {

	public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

	int y;
	y = sc.nextInt();
				
	if (y < 0) {
	  System.out.println("NEGATIVO");
   }else if (y >= 0) {
	 System.out.println("NAO NEGATIVO");
				
	}
	
	sc.close();
	
  }	
}
