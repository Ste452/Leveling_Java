package Testing_in_Java_out_of_curiosity.main.src;

import java.math.BigInteger;
import java.util.Locale;
import java.util.Scanner;

public class FactorialCalculation {

    public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();
	BigInteger factorial = calculateFactorial(n);
	System.out.println("The factorial of " + n + " is " + factorial);

	sc.close();
    }

    public static BigInteger calculateFactorial(int n) {
	if (n < 0) {
	    return BigInteger.ZERO; // Factorial of negative numbers is zero.
	}

	BigInteger result = BigInteger.ONE;
	for (int i = 1; i <= n; i++) {
	    result = result.multiply(BigInteger.valueOf(i));
	}

	return result;
    }
}
