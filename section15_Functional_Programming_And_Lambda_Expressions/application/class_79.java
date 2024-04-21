package section15_Functional_Programming_And_Lambda_Expressions.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

import section15_Functional_Programming_And_Lambda_Expressions.model.entities.Product;

public class class_79 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD case", 80.90));

		// Lambda Expression
		
		/* Function<Product, String> func = p 
				-> p.getName().toUpperCase(); */
		
		List<String> names = list.stream()
				
			// Lambda inline	
			.map(p -> p.getName().toUpperCase())
			.collect(Collectors.toList());
		
		names.forEach(System.out::println);
	}

}
