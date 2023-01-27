package oopsmethods;

public class Calculator {
    int x, y;

    public void addTwo() {
        System.out.println("\nthe sum is " + (x + y));
    }

    public void addTwoWithInput(int a, int b) {
        System.out.println("\nthe sum is " + (a + b));
    }

    public int addTwoWithInputReturnsSomething(int a, int b) {
        return (a + b);
    }

    // method overloading
    public void add(int x, int y) {
    };

    public void add(String fName, String lName) {
    };

    public void add(int x, String y) {
    };

    public void add(int x, int y, int z) {
    };

    public void add(String x, int y, int z) {
    };

}
