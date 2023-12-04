package exercise_module5_Introduction_to_object_oriented_programming.main.src;

import java.util.Locale;
import java.util.Scanner;

import exercise_module5_Introduction_to_object_oriented_programming.entities.Salary_problem;

public class application_salary {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Salary_problem entrence = new Salary_problem();
		
		System.out.print("Name: ");
		entrence.name = sc.nextLine();
		System.out.print("Gross salary: ");
		entrence.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		entrence.tax = sc.nextDouble();
        
		System.out.println();
		
		System.out.println("Employee: " + entrence);
		
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		entrence.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("Updated data: " + entrence);
		
		sc.close();
	}

}
