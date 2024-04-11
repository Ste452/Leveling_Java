package section15_Functional_Programming_And_Lambda_Expressions.exercise.application;

import java.util.Comparator;

import section15_Functional_Programming_And_Lambda_Expressions.exercise.model.entities.Product;

public class MyComparator implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		
	}
}
