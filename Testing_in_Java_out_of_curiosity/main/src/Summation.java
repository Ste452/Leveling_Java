package Testing_in_Java_out_of_curiosity.main.src;

public class Summation {
    public static void main(String[] args) {
        
    	int n = 10; // Change this value to sum up to a different number
        int sum = calculateSummation(n);
        System.out.println("The summation of the first " + n + " integers is: " + sum);
    }

    // That a aritmetic progression
    public static int calculateSummation(int n) {
        
    	int sum = 0;
        
    	for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}

