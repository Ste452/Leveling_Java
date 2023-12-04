package exercise_module1_sequencial_structure.main.src;

import java.util.Locale;

public class exercise2_module_1 {

	public static void main(String[] args) {
		
		//exercicio 02
		 //1
		 double pi, r = 2, p = 0.00004;
		
		
		 Locale.setDefault(Locale.US);
		 
		 pi = 3.14159;
		 r = Math.pow(r, 2);
		 
		 
		 var finish = pi*r + p;
		 
		 System.out.println("A = " + finish);
		 
		 // 2
		
		 double pi1, r1 = 100.64;
		 
		 pi1 = 3.14159;
		 r1 = Math.pow(100.64, 2);
		 
		 
		 double finish1 = pi1*r1;
		 
		 System.out.printf("A=%.4f%n", finish1);
		 
		 //3
		 
		 double pi2, r2 = 150.00;
		 
		 pi2 = 3.14159;
        r2 = Math.pow(150.00, 2);
        
       
		 double finish2 = pi2*r2;
        
        System.out.printf("A=%.4f%n", finish2);
        
	}
}
