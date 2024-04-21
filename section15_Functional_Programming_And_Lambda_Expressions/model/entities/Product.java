package section15_Functional_Programming_And_Lambda_Expressions.model.entities;

public class Product {

	private String name;
    private Double price;
		
    public Product() {
	}

	public Product(String name, Double price) {
		this.name = name;
	    this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	// Class 77
	
	public static boolean staticProductPredicate(Product p) {
		return p.getPrice() >= 100.0;
	}
	
	public boolean nonStaticProductPredicate() {
		return price >= 100.0;
	} 
	
	// Class 78
	
	public static void staticPriceUpdate(Product p) {
		p.setPrice(p.getPrice() * 1.1);
	}
	
	public void nonStaticPriceUpdate() {
		setPrice(getPrice() * 1.1);
	}
	
	// Class 79
	
	public static String staticUpperCaseName(Product p) {
		return p.getName().toUpperCase();
	}
	
	public String nonStaticUpperCaseName() {
		return name.toUpperCase();
	}
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
}
