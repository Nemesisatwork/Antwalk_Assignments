package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ProductTest {
    public static void main(String[] args) {
        ArrayList<Product> prodList = new ArrayList<>();
        prodList.add(new Product(1001, "TV", 95000, 1, "Apple", 0));
        prodList.add(new Product(1002, "Tripod", 7000, 2, "Digitech", 100));
        prodList.add(new Product(1003, "Laptop", 50000, 1, "MI", 50));
        prodList.add(new Product(1004, "Camera", 60000, 5, "Sony", 0));
        prodList.add(new Product(1005, "Monitor", 25000, 15, "Asus", 150));
        prodList.add(new Product(1006, "Monitor", 25000, 15, "Asus", 150));
        prodList.add(new Product(1007, "Monitor", 25000, 15, "Asus", 150));

        // find out the products with free delivery
        // List
        List<String> freedelprod = prodList.stream().filter(p -> p.delieryCharges == 0.0f) // get all products with zero
                                                                                           // delivery charges
                .map(p -> p.name) // out of the products listed, get the name attributes
                .collect(Collectors.toList()); // collect them in a list and return names of product as per condition

        System.out.println(freedelprod);

        // Sets
        Set<String> freedelprod2 = prodList.stream().filter(p -> p.delieryCharges == 0.0f) // get all products with zero
                                                                                           // delivery charges
                .map(p -> p.name) // out of the products listed, get the name attributes
                .collect(Collectors.toSet()); // collect them in a list and return names of product as per condition

        System.out.println(freedelprod2);

        // using forEach
        prodList.stream()
                .filter(p -> p.delieryCharges == 0.0f)
                .forEach(p -> System.out.println(p.price + 100));

        // using count
        long noOfProds = prodList.stream()
                .filter(p -> p.delieryCharges == 0.0f)
                .count();

        System.out.println(noOfProds);
    }
}
