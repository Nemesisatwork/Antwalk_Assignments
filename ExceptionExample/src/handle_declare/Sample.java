package handle_declare;

public class Sample {

    // handle
    public void method1() {
        try {
            int x = 10;
            int y = 2;
            int z = x / y;
            System.out.println(z);
            int[] num = new int[5];
            num[5] = 100;
        } catch (ArithmeticException e) {
            System.out.println("Something went wrong");
        }
    }

    // declare
    public void method2() throws ArithmeticException {

    }
}
