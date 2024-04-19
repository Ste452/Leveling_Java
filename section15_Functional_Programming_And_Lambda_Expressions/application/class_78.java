package section15_Functional_Programming_And_Lambda_Expressions.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

import section15_Functional_Programming_And_Lambda_Expressions.model.entities.Product;

public class class_78 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD case", 80.90));

        double factor = 1.1;
        
        list.forEach(p -> p.setPrice(p.getPrice() * factor));

        list.forEach(p -> System.out.printf("%s - %.2f%n", p.getName(), p.getPrice()));
    }

}
