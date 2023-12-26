package section3_Repetitive_structures;

public class class_14 {
    public static void main(String[] args) {

	int x = 5;
	int z = 0;

	while (x > 2) {
	    z = z * 3;
	    System.out.print(z);
	    x = x - 1;
	    System.out.print(x);
	}

	System.out.println("Fim");

	int x1 = 2;
	int y = 0;
	while (x1 < 60) {
	    System.out.println(x1);
	    x1 = x1 * 2;
	    y = y + 10;
	}

	int x2 = 100;
	int w = 100;
	while (x2 != w) {
	    System.out.println("olha");
	    x2 = (int) Math.sqrt(w);
	}

    }
}
