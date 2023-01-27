package lambda;

public class Test {
    public static void main(String[] args) {
        Readable book3 = new Readable() {
            public void read() {
                System.out.println("I am reading a story book");
            }
        };
        book3.read();

        // lambda expression without argument and return type
        Readable book1 = () -> {
            System.out.println("I am reading a book");
        };

        // lambda expression with argument but without return type
        Greetable g = (x) -> {
            System.out.println("Hello " + x);
        };
        g.greet("Aniket");

        // lambda expression with arguments and return type
        Greetings g1 = (fn, ln) -> {
            return ("Hello " + fn + " " + ln);
        };
        System.out.println(g1.greet("Aniket", "Saha"));
    }
}
// lambda expression
// leftside -> rightside
// arguments -> body to poerate on the arguments