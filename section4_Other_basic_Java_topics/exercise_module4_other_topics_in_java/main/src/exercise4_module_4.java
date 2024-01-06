package section4_Other_basic_Java_topics.exercise_module4_other_topics_in_java.main.src;

import java.util.Locale;
import java.util.Scanner;

public class exercise4_module_4 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
	    Scanner sc = new Scanner(System.in);

	    int n = sc.nextInt();
	    
	    for(int i = 0; i < n; i++) {
	    	int x = sc.nextInt();
	    	int y = sc.nextInt();
	    	
	    	if (y == 0) {
	    		System.out.println("Division impossible");
	    	} else {
	    		double div = (double) x / y;
	            System.out.printf("Division iguals: %.1f%n", div);
	    	}
	    }
	    
	    sc.close();
	}

}
