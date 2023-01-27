package oopsinheritance;

public class Person {

    String name;
    int age;
    String address;

    public Person() {
        System.out.println("Person constructor");
    }

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
        System.out.println("This is person constructor");
    }
}
