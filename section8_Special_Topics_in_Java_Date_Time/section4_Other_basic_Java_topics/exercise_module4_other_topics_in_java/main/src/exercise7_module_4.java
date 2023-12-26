package exercise_module4_other_topics_in_java.main.src;

import java.util.Scanner;

public class exercise7_module_4 {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for (int i=1; i<=n; i++) {

			int primeiro = i;
			int segundo = i * i;
			int terceiro = i * i * i;
			System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);
		}
        
        sc.close();
	}

}
