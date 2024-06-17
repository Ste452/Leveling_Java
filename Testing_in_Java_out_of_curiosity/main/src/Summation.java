package Testing_in_Java_out_of_curiosity.main.src;

public class Summation {
    public static void main(String[] args) {
        
    	int n = 10; // Change this value to sum up to a different number
        int sum = calculateSummation(n);
        
        System.out.println("\nThe sum of integers is = " + sum);
        
    }

    // That's a geometric progression
    public static int calculateSummation(int n) {
        
    	int sum = 1;
        
    	for (int i = 1; i <= n; i++) {
            sum += i;
            System.out.println("\nThe summation of the first " + n + " integers is: " + sum);
        }
        return sum;
    }
   
    public static int calculateGeometricProgression(int n) {
        int sum = 0; // Initialize the sum such as 0
        int x = 1;   // Initialize x such as 1

        // Loop for sum that numbers in 1 still n
        while (x <= n) {
            sum += x; // Add x for sum
            x++;      // Increment x
            
            System.out.println("\nCalculations of the sums of arithmetic progression = " + x + " " + sum);
        }

        return sum; // Return that sum of integers numbers still n
    }
}

