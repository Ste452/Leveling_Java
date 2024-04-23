package Testing_in_Java_out_of_curiosity.main.src;

import java.util.Scanner;

public class How_to_make_a_person_love_you {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Do you want to make one person like you (Y/N)");
		
		char bool = sc.nextLine().charAt(0);
		
		if (bool == 'y' || bool == 'Y') {
			System.out.println("\nThe goal of winning someone over is to be yourself.\n"
					+ "Methodically find out what the person thinks of you so you can please them.\n"
					+ "Think about why you feel love and if you notice that your thoughts make you\n"
					+ "believe that the person pleases you, act in a practical and precise way so that she notices your affection.\n"
					+ "Good luck with your romantic journey :) 100% porcent to winning someone");
			
		} else {
			System.out.println("Dont be afraid because you will to win the love are you want");
		}
		
		
		
		sc.close();
	}
}
