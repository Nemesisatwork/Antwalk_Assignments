package app;

import java.util.Scanner;

public class Order {

    public static void main(String[] args) {
        // customer
        Customer c = new Customer("Aniket", "abc@abc.com", 123456);

        // products
        Product p1 = new Product(1, "TV", "Sony", 5, 50000);
        Product p2 = new Product(2, "Laptop", "Asus", 5, 70000);
        Product p3 = new Product(3, "Camera", "Sony", 5, 100000);
        Product p4 = new Product(4, "Refridgerator", "Samsung", 5, 20000);
        Product p5 = new Product(5, "Washing Machine", "LG", 5, 10000);

        Cart ct = new Cart();

        Inventory inv = new Inventory();

        int n1 = 1, ch;
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello " + c.name + "! What would you like to buy today?\n");

        while (n1 == 1) {
            System.out.println("The product list is as follows - ");

            // displaying the product details
            p1.display();
            p2.display();
            p3.display();
            p4.display();
            p5.display();

            // asking for user input
            System.out.println("\nEnter the product id to add to your cart or enter 0 to exit and view your cart -");
            ch = sc.nextInt();

            // using choice based conditions
            switch (ch) {
                case 0:
                    n1 = 0;
                    break;
                case 1:
                    ct.addtoCart(p1);
                    p1.prodadded();
                    System.out.println("Product added to cart");
                    break;
                case 2:
                    ct.addtoCart(p2);
                    p2.prodadded();
                    System.out.println("Product added to cart");
                    break;
                case 3:
                    ;
                    ct.addtoCart(p3);
                    p3.prodadded();
                    System.out.println("Product added to cart");
                    break;
                case 4:
                    ct.addtoCart(p4);
                    p4.prodadded();
                    System.out.println("Product added to cart");
                    break;
                case 5:
                    ct.addtoCart(p5);
                    p5.prodadded();
                    System.out.println("Product added to cart");
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }

        }
        sc.close();
        System.out.println("\nThe inventory is as follows - \n");
        inv.dispInventory(p1);
        inv.dispInventory(p2);
        inv.dispInventory(p3);
        inv.dispInventory(p4);
        inv.dispInventory(p5);
        ct.disp();
    }

}
