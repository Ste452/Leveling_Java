package section10_Inheritance_and_polymorphism.exercise_module_10_Inheritance_and_Polymorphism.Entities;

public class Product {
	protected String name;
	protected Double price;

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String priceTag() {
		return name + " $ " + String.format("%.2f", price);
	}
}
