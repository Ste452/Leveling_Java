package section15_Functional_Programming_And_Lambda_Expressions.model.util;

import java.util.function.Predicate;

import section15_Functional_Programming_And_Lambda_Expressions.model.entities.Product;

public class ProductPredicate implements Predicate<Product>{

	@Override
	public boolean test(Product p) {
		return p.getPrice() >= 100.0;
	}
}