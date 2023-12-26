package section10_Inheritance_and_polymorphism.exercise_module_10_Inheritance_and_Polymorphism.Entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Used_Product extends Product {
    private Date manufactureDate;

    public Used_Product(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return name + " (used) $ " + String.format("%.2f", price) + " (Manufacture date: " + sdf.format(manufactureDate) + ")";
    }
}
