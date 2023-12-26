package section4_Other_basic_Java_topics.exercise_module4_other_topics_in_java.main.src;

import java.util.Scanner;

public class exercise3_module_4 {

	public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            double value1 = sc.nextDouble();
            double value2 = sc.nextDouble();
            double value3 = sc.nextDouble();

            double weightedAverage = (value1 * 2 + value2 * 3 + value3 * 5) / 10;
            System.out.printf("%.1f%n", weightedAverage);
        }

        sc.close();

	}

}
