package collections;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Aniket");
        list.add(123456);
        list.add(true);
        list.add(45.2f);

        System.out.println(list);

        ArrayList<Book> bList = new ArrayList<>();
        Book b1 = new Book(1001, "The partner", 1000);
        Book b2 = new Book(1002, "The crime", 100);
        Book b3 = new Book(1003, "The dragon", 500);

        bList.add(b1);
        bList.add(b2);
        bList.add(b3);

        System.out.println(b1);
    }
}
