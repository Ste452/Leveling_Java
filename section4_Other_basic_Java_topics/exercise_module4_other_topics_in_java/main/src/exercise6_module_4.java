package section4_Other_basic_Java_topics.exercise_module4_other_topics_in_java.main.src;

import java.util.Locale;
import java.util.Scanner;

public class exercise6_module_4 {

	public static void main(String[] args) {
   
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			if (n % i == 0) {
				System.out.println(i);
			} else {
				System.out.println("Check the denominator of your division");
			}
		}
		
        sc.close();
	}

}
