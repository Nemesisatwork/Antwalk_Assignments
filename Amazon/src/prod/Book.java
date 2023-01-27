package prod;

public class Book extends Product {

    int bookID;
    float price = 1000;

    public Book(int id, String name, String brand, int bookID) {

        super(id, name, brand);
        this.bookID = bookID;
        System.out.println("Book is called");
    }

    public void display() {
        System.out.println(
                "the details are - \nID - " + id + "\nName - " + name + "\nBrand - " + brand + "\nBook ID - " + bookID);
        System.out.println("\nOriginal Price - " + price + "\nBook discounted price - " + (price - price * 0.1));
    }
}
