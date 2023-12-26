package section9_Enumerations_composition.entities;

import java.util.Date;

import section6_Constructors_this_word_overloading_encapsulation.entities.Product_class_24;

public class Order {
	private Date date;
	private Product_class_24 product;
	
	public Order(Date date, Product_class_24 product) {
		super();
		this.date = date;
		this.product = product;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Product_class_24 getProduct() {
		return product;
	}

	public void setProduct(Product_class_24 product) {
		this.product = product;
	}
}
