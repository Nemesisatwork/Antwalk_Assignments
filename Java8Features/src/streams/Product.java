package streams;

public class Product {
    int prodId;
    String name;
    float price;
    int quantity;
    String brand;
    float delieryCharges;

    public Product(int prodId, String name, float price, int quantity, String brand, float delieryCharges) {
        this.prodId = prodId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.brand = brand;
        this.delieryCharges = delieryCharges;
    }

    public Product() {
        super();
    }

    @Override
    public String toString() {
        return "Product [prodId=" + prodId + ", name=" + name + ", price=" + price + ", quantity=" + quantity
                + ", brand=" + brand + ", delieryCharges=" + delieryCharges + "]";
    }

}
