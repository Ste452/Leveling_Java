package section14_Exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class class_46 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        try {
        	String[] vect = sc.nextLine().split(" ");
		    int position = sc.nextInt();
		    System.out.println(vect[position]);
        
        } catch (ArrayIndexOutOfBoundsException e) {
        	System.out.println("\nInvalid Position!");
        
        } catch (InputMismatchException e) { 
        	System.out.println("\nInput error!");
        }
		
		System.out.println("\nEnd of Program");
        
		sc.close();
	}

}
