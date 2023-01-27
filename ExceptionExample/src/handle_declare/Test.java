package handle_declare;

public class Test {
    public static void main(String[] args) {
        Sample obj = new Sample();
        obj.method1();

        try {
            obj.method2();
        } catch (Exception e) {
            System.out.println();
        }
    }
}
