package section14_Generics_Set_Map.application;

import java.util.LinkedHashSet;
import java.util.Set;

public class class_69 {

	public static void main(String[] args) {

		Set<String> set = new LinkedHashSet<String>();
		
		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");

		set.removeIf(x -> x.charAt(0) == 'T');
		
		for (String p : set) {
			System.out.println(p);
		}
	}
}