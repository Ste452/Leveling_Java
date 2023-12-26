package section2_Conditional_structure;
import java.util.Scanner;

public class class_7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int hora;
		
        System.out.println("Quantas horas?");
        hora = sc.nextInt();
        
        
        if (hora < 12) {
        	System.out.println("Bom dia");
       
	    }else if (hora < 18) {
        	System.out.println("Boa tarde");
        
        }else{
        	System.out.println("Boa noite");
        }
         
        
        /*if(hora < 12) {
        	System.out.println("Bom dia");
        }else{
        	System.out.println("Boa tarde");
        }*/
		
		/*int x = 5;
		if (x < 0) {
		   System.out.println("Boa tarde");
		}*/

		sc.close();

	}

}
