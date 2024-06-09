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
        int sum = 0; // Inicializa a soma como 0
        int x = 1;   // Inicializa x como 1

        // Loop para somar os números de 1 até n
        while (x <= n) {
            sum += x; // Adiciona x à soma
            x++;      // Incrementa x
            
            System.out.println("\nCalculations of the sums of arithmetic progression = " + x + " " + sum);
        }

        return sum; // Retorna a soma dos números até n
    }
}

