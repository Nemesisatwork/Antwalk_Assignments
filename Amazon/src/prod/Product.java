package prod;

public class Product {

    int id;
    String name;
    String brand;

    public Product(int id, String name, String brand) {

        this.id = id;
        this.name = name;
        this.brand = brand;
        System.out.println("Product is called");
    }

    public void display() {
        System.out.println("the details are - \nID - " + id + "\nName - " + name + "\nBrand - " + brand);
    }

}
