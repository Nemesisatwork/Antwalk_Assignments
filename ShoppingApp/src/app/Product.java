package app;

public class Product {
    int id;
    String name;
    String brand;
    int qty;
    float price;

    public Product(int id, String name, String brand, int qty, float price) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.qty = qty;
        this.price = price;
    }

    public void prodadded() {
        this.qty -= 1;
    }

    public void display() {
        System.out.println("\nId=" + id + "\nName=" + name + "\nBrand=" + brand + "\nQty=" + qty + "\nPrice=" + price);
    }
}
