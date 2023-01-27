package DyMethodDisplatch;

public class Test {
    public static void main(String[] args) {
        MyClass m = new MyClass();
        YourClass y = new YourClass();
        HisClass h = new HisClass();

        MyClass genClass; // declared an object but not instantiated

        genClass = m;
        genClass.lecture();

        genClass = y;
        genClass.lecture();

        genClass = h;
        genClass.lecture();
    }
}
