package collections;

public class Book {
    int id;
    String title;
    int price;

    public Book(int id, String title, int price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book [id=" + id + ", title=" + title + ", price=" + price + "]";
    }

}
