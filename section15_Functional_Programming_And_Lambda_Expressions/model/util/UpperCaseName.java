package section15_Functional_Programming_And_Lambda_Expressions.model.util;

import java.util.function.Function;

import section15_Functional_Programming_And_Lambda_Expressions.model.entities.Product;

public class UpperCaseName implements Function<Product, String>{

	@Override
	public String apply(Product p) {

		return p.getName().toUpperCase();
	}

}
