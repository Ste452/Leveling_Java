package exercise_module_10_Inheritance_and_Polymorphism.Entities;

public class Imported_Product extends Product {
    private Double customsFee;

    public Imported_Product(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double totalPrice() {
        return price + customsFee;
    }

    @Override
    public String priceTag() {
        return name + " $ " + String.format("%.2f", totalPrice()) + " (Customs fee: $ " + String.format("%.2f", customsFee) + ")";
    }
}

