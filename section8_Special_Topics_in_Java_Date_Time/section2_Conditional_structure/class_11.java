package section5_Conditional_structure;
import java.util.Locale;

public class class_11 {

	public static void main(String[] args) {

		
    	Locale.setDefault(Locale.US);
		double price = 400.00;
		double discount;
		if (price > 100.0) {
		
			discount = price * 0.1;
		
		}else { 
		
			discount = 0.0;
		
		}
		System.out.println(discount);


   }

}
