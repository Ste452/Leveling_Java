package section10_Memory_behavior_arrays_lists;

public class class_27 {

	public static void main(String[] args) {

		String[] vect = new String[] {"Maria", "Bob", "Alex"};

		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
	
		System.out.println("-------------------");
		
		for (String obj : vect) {
			System.out.println(obj);
		}
		
	}

}