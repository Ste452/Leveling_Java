package section5_Conditional_structure;
import java.util.Scanner;
import java.util.Locale;

    public class class_10 {
    	
    	public static void main(String[] args) {
    		
    	Scanner sc = new Scanner(System.in);
    	Locale.setDefault(Locale.US);
    	
    	double preco = 34.5;

    	double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;

    	System.out.println(desconto);
    	
    	sc.close();
    }

}