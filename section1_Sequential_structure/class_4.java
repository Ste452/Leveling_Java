package section4_Sequential_structure;
import java.util.Locale;
import java.util.Scanner;

public class class_4 {

    public static void main(String[] args) {

	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);

	String x;
	x = sc.next();

	System.out.println("Você Digitou: " + x);

	int y;
	y = sc.nextInt();

	System.out.println("Você Digitou: " + y);

	double z;
	z = sc.nextDouble();

	System.out.printf("Você Digitou: %.2f%n", z);

	@SuppressWarnings("unused")
	char i;
	i = sc.next().charAt(0);
	System.out.println("Você Digitou %.2f%n");

	String x2;

	int y2;

	double z2;
	x2 = sc.next();
	y2 = sc.nextInt();
	z2 = sc.nextDouble();
	System.out.println("Dados digitados:");
	System.out.println(x2);
	System.out.println(y2);
	System.out.println(z2);

	sc.close();

    }
}
