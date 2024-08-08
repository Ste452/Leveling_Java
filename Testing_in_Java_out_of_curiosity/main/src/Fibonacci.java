package Testing_in_Java_out_of_curiosity.main.src;

public class Fibonacci {

	public static void main(String[] args) {
		
		int n = 13;
		
		fibonacciIterative(n);
	}

	public static void fibonacciIterative(int n) {
        
		int num1 = 0, num2 = 1;
        System.out.print("Sequência de Fibonacci: ");
        
        for (int i = 0; i < n; i++) {
            System.out.print(num1 + " ");
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
    }
}
