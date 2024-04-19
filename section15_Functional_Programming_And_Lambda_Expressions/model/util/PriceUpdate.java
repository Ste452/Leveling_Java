package section15_Functional_Programming_And_Lambda_Expressions.model.util;

import java.util.function.Consumer;

import section15_Functional_Programming_And_Lambda_Expressions.model.entities.Product;

public class PriceUpdate implements Consumer<Product> {

	@Override
	public void accept(Product p) {
		p.setPrice(p.getPrice() * 1.1);
	}

}
