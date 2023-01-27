package oopsconstructors;

public class Person {

    String name;
    int age;
    String address;

    // default constructor
    public Person() {
        System.out.println("This is person constructor");
    }

    // constructor with 3 arguments
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
        System.out.println("This is person constructor");
    }

    // constructor with 2 args
    public Person(String name, int age) {
        this.name = name;
        if (age <= 0)
            System.out.println("Age cannot be zero");
        else
            this.age = age;

        System.out.println("This is person constructor");
    }

    // constructor with 1 args
    public Person(String name) {
        this.name = name;

        System.out.println("This is person constructor");
    }
}
