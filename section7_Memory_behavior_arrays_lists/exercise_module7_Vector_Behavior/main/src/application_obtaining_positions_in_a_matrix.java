package section7_Memory_behavior_arrays_lists.exercise_module7_Vector_Behavior.main.src;

import java.util.Scanner;

public class application_obtaining_positions_in_a_matrix {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of lines (M): ");
		int m = sc.nextInt();

		System.out.print("Enter the number of columns (N): ");
		int n = sc.nextInt();

		int[][] master = new int[m][n];

		for (int i = 0; i < master.length; i++) {
			for (int j = 0; j < master[i].length; j++) {
				master[i][j] = sc.nextInt();
			}
		}
		System.out.print("Enter a number of the x, if only if x = ");
		int x = sc.nextInt();

		for (int i = 0; i < master.length; i++) {
			for (int j = 0; j < master[i].length; j++) {
				if (master[i][j] == x) {
					System.out.println("Position " + i + "," + j + ":");
					
					if (j > 0) {
						System.out.println("Left: " + master[i][j - 1]);
					}

					if (i > 0) {
						System.out.println("Up: " + master[i - 1][j]);
					}

					if (j < master[i].length - 1) {
						System.out.println("Right: " + master[i][j + 1]);
					}

					if (i < master.length - 1) {
						System.out.println("Down: " + master[i + 1][j]);
					}
				}
			}
		}
		sc.close();
	}

}