package abstractpack;

public class Test {

    public static void main(String[] args) {

        Person p1 = new Employee();
        Person p2 = new Student();
        p1.doSomething();

        Artist a1 = new Employee();
        a1.doArt();

        Player pl = new Employee();

        Promotable pp1 = new Employee();
        Promotable pp2 = new Product();

        Person obj = new Employee();
        Employee x = (Employee) obj;

    }
}
