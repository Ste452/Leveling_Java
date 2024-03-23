package section14_Generics_Set_Map.application;

import java.util.ArrayList;
import java.util.List;

public class class_67 {
	
	public static void main(String[] args) {
		
		List<Integer> myInts = new ArrayList<Integer>();
		List<Double> myDoubles = new ArrayList<Double>();
		List<Object> myObjs = new ArrayList<Object>();
		
		copy(myInts, myObjs);
		printList(myObjs);
		copy(myDoubles, myObjs);
		printList(myObjs);
	}
	
	public static void copy(List<? extends Number> source, List<? super Number> destiny) {
		for (Number number : source) {
			destiny.add(number);
		}
	}
	
	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj + " ");
		}
		System.out.println();
	}
}
