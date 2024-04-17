package section15_Functional_Programming_And_Lambda_Expressions.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.function.Predicate;

import section15_Functional_Programming_And_Lambda_Expressions.model.entities.Product;

public class class_77 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		List<Product> productList = new ArrayList<>();

		productList.add(new Product("Tv", 900.00));
		productList.add(new Product("Mouse", 50.00));
		productList.add(new Product("Tablet", 350.00));
		productList.add(new Product("HD Case", 80.90));

		System.out.print("Enter the value of proposition on the value of the products list: ");
		
		double min = sc.nextDouble();
		
		Predicate<Product> pred = p -> p.getPrice() >= min && min <= 150.0; 
		
		productList.removeIf(pred);
		
		for (Product p : productList) {
			System.out.println("\n" + "" + p);
		}
		
		sc.close();
	}
}