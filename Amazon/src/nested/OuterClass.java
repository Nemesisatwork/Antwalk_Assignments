package nested;

public class OuterClass {
    public void method1() {
        class Local {
            public void localMethod1() {
                System.out.println("Localmethod1 got executed");
            }

            public void localMethod2() {
                System.out.println("Localmethod2 got executed");
            }
        }
    }
}
