package section4_Other_basic_Java_topics;
import java.util.Locale;
import java.util.Scanner;

public class class_19 {

	public static void main(String[] args) {
	
		/*
		Este programa calcula as raízes de uma equação do segundo grau 
		
		Os valores dos coeficientes devem ser digitados um por linha
		*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		@SuppressWarnings("unused")
		double a, b, c, delta;
		
		System.out.println("Digite os valores dos coeficientes:");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		delta = b * b - 4 * a * c; // cálculo do valor de delta
		
		sc.close();
	}

}
