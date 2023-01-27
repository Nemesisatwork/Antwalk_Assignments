package abstractpack;

public abstract class Person {

    String name;
    int age;
    String address;

    // we can have zero or more abstract method
    public abstract void doSomething();// onyl declaration no implementation
    // no body

    // we can have another methods also
    public void display() {

    }
}
