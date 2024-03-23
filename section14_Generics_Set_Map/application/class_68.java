package section14_Generics_Set_Map.application;

import section14_Generics_Set_Map.model.entities.Client;

public class class_68 {

	public static void main(String[] args) {

		Client c1 = new Client("Maria", "maria@gamil.com");
		Client c2 = new Client("Maria", "alex@gmail.com");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(c1 == c2);
	}
}