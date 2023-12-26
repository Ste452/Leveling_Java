package section4_Other_basic_Java_topics.exercise_module4_other_topics_in_java.main.src;

import java.util.Scanner;

public class exercise1_module_4 {

	public static void main(String[] args) {
		getOddNumbers();
	}

	private static void getOddNumbers() {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		for (int i = 1; i <= x; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}

		sc.close();
	}

}
