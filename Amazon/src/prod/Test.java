package prod;

public class Test {

    public static void main(String args[]) {
        // Product p = new Product();
        // Electronic e = new Electronic();
        Book b = new Book(101, "Person of the Year", "Times", 1001);
        b.display();
        Magazine m = new Magazine(101, "Person of the Year", "Times", 1001, 2023);
        m.display();

    }
}
