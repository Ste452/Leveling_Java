package Testing_in_Java_out_of_curiosity.main.src;

public class ArithmeticProgression {

    public static void main(String[] args) {
        
        int n = 10;  // Número de termos
        int a1 = 1;  // Primeiro termo da progressão aritmética
        int r = 2;   // Razão da progressão aritmética
        
        printArithmeticProgression(a1, r, n);
    }

    private static void printArithmeticProgression(int a1, int r, int n) {
        for (int i = 0; i < n; i++) {
            int term = a1 + i * r;  // Fórmula do termo geral da progressão aritmética
            System.out.println(term);
        }
    }
}
