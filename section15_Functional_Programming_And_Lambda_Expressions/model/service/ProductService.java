package section15_Functional_Programming_And_Lambda_Expressions.model.service;

import java.util.List;
import java.util.function.Predicate;

import section15_Functional_Programming_And_Lambda_Expressions.model.entities.Product;

public class ProductService {

	public double filteredSum(List<Product> list, Predicate<Product> criteria) {
		double sum = 0.0;
		for (Product p : list) {
			if (criteria.test(p)) {
				sum += p.getPrice();
			}
		}
		return sum;
	}
	
}
