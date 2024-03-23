package section14_Generics_Set_Map.application;

import java.util.ArrayList;
import java.util.List;

public class class_66 {
	
	public static void main(String[] args) {
		
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(5);
		
		
		List<? extends Number> list = intList;
		
		Number x = list.get(0);
		
		System.out.println(x);
	}
}
