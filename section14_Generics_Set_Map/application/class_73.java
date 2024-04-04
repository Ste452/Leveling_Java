package section14_Generics_Set_Map.application;

import java.util.Map;
import java.util.TreeMap;

public class class_73 {

	public static <K, V> void main(String[] args) {
		
		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("Username", "Maria");
		
		cookies.put("Email", "maria@gmail.com");
		
		cookies.put("Phone", "99771122");
		
		cookies.remove("Email");
		cookies.put("Phone", "99771133");
		
		System.out.println("Contains 'Phone' key: " + cookies.containsKey("Phone"));
		System.out.println("Phone number: " + cookies.get("Phone"));
		System.out.println("Email: " + cookies.get("Email"));
		System.out.println("Size: " + cookies.size());
		
		System.out.println("\nALL COOKIES:");
		
		for (String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key)); 	
		}
	}
}