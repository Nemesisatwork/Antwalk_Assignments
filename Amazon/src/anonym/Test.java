package anonym;

public class Test {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.read();

        Readable r1 = new Readable() {
            public void read() {
                System.out.println("This is a magazine from anonymous class");
            }

            public void print() {
                System.out.println("This is printing the magazine");
            }
        };
        r1.read();
        r1.print();
        book1.wash();
        Washable w1 = new Washable() {
            public void wash() {
                System.out.println("I'm washing my jacket");
            }
        };
        w1.wash();
    }
}
