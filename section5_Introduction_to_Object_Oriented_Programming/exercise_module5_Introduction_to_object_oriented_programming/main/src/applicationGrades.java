package section5_Introduction_to_Object_Oriented_Programming.exercise_module5_Introduction_to_object_oriented_programming.main.src;

import java.util.Locale;
import java.util.Scanner;

import section5_Introduction_to_Object_Oriented_Programming.exercise_module5_Introduction_to_object_oriented_programming.entities.Grades;

public class applicationGrades {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Grades student = new Grades();
		
	    student.name = sc.nextLine();
	    student.grade1 = sc.nextDouble();
	    student.grade2 = sc.nextDouble();
	    student.grade3 = sc.nextDouble();
	    student.grade4 = sc.nextDouble();
	    
	    System.out.println();
	    System.out.printf("Final Grade: %.2f%n", student.finalGrade());
	    
	    System.out.printf("Grade average: %.2f%n", student.mediaOfGrades());
	    
	    if (student.mediaOfGrades() >= 7.0) {
	    	System.out.println();
			System.out.println("Mission complete");
		} else if (student.mediaOfGrades() == 5.0){
			System.out.println();
			System.out.println("The student is recovering.");
		} else {
			System.out.println();
	        System.out.println("Disaproved");
	    }
	    sc.close();
	}
}
