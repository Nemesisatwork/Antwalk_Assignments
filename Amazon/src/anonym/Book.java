package anonym;

public class Book implements Readable, Washable {
    public void read() {
        System.out.println("Reading a book");
    }

    public void print() {
        System.out.println("I am printing");
    }

    public void wash() {
        System.out.println("I'm washing my shirt");
    }
}
