package abstractpack;

public class Employee extends Person implements Player, Artist, Promotable, Transferrable {

    public void doSomething() {
        System.out.println("Employee works");
    }

    public void calculateSalary() {
        System.out.println("Calculating salary");
    }

    public void play() {
        System.out.println("Employee is playing");
    }

    public void doArt() {
        System.out.println("Employee is doing art also");
    }

    public void transfer() {
        System.out.println("Employee is transferred");
    }

    public void promote() {
        System.out.println("Employee is promoted");
    }

    public void do1() {
        System.out.println("This is doable");
    }
}
