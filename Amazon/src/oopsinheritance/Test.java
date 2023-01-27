package oopsinheritance;

public class Test {

    public static void main(String args[]) {
        Person p = new Person();
        Employee e = new Employee();
        Student s = new Student();
        Manager m = new Manager("Upasana", 32, "Bengaluru", 1001, "Training");
        Designer d = new Designer();

        Payroll ps = new Payroll();
        ps.getSalary(m);
        ps.getSalary(e);
        ps.getSalary(d);

    }

}
