package section14_Generics_Set_Map.application;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class class_64 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		List<Integer> myLists = Arrays.asList(5, 2, 10);
		printList(myLists);
		
		List<String> myStrs = Arrays.asList("Maria", "Alex", "Bob");
		printList(myStrs);
	}
	
	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}
		
	}	
}