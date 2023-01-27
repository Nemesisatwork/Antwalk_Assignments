package oopsmethods;

public class Test {
    public static void main(String args[]) {
        Calculator cal = new Calculator();
        cal.x = 10;
        cal.y = 20;
        cal.addTwo();
        cal.addTwoWithInput(40, 30);
        int result = cal.addTwoWithInputReturnsSomething(50, 50);
        System.out.println(result);
        System.out.println(cal.addTwoWithInputReturnsSomething(200, 100));
    }
}
