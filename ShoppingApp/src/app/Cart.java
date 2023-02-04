package app;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    int id;
    String name;
    String brand;
    int qty = 0, i;
    float price;
    static float pricetotal;

    public Cart() {
    }

    List<Product> prodlist = new ArrayList<>();

    public void addtoCart(Product x) {
        prodlist.add(x);
        pricetotal += x.price;
    }

    public void disp() {

        System.out.println("\nYour cart contains - \n");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < prodlist.size(); j++) {
                if (prodlist.get(j).id == i + 1) {
                    prodlist.get(j).qty = 5 - prodlist.get(j).qty;
                    prodlist.get(j).display();
                }
            }
        }
        System.out.println("\nThe total cart value is - " + pricetotal);
    }

}
