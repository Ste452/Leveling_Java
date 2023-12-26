package section7_Other_basic_Java_topics;
import java.util.Scanner;

public class class_17 {

	public static void main(String[] args) {
        
		// Operadores Bitwise
		
	    	/*
	    	 * & Bitwise "AND" operation
                    | Bitwise "OR" operation
                    ^ Bitwise "exclusive-OR" operation
	    	 */
	    
		int n1 = 89;
		int n2 = 60;
		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int mask = 0b00100000;
		
		if ((n & mask) != 0) {
			System.out.println("6th bit is true!");
		} else {
			System.out.println("6th bit is false!");
		}
		
		sc.close();
	}

}
