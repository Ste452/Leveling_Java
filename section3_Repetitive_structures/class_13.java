package section6_Repetitive_structures;
import java.util.Scanner;
import java.util.Locale;
public class class_13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
		
		int x = sc.nextInt();        
		
		int soma = 0;
		while (x != 0) {
			soma = soma + x;
			x = sc.nextInt();
			
		}
		
		System.out.println(soma);
		
		sc.close();
	}

}
