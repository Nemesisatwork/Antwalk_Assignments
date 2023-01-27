package covariant;

public class TestAll {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.getA().show();

        Child c = new Child();
        c.getB().display();
    }
}
