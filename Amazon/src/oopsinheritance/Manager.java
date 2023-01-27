package oopsinheritance;

public class Manager extends Employee {
    String deptName;

    public Manager(String name, int age, String address, int empId, String deptName) {

        super(name, age, address, empId);
        this.deptName = deptName;
        System.out.println("Manager constructor");
    }

    public void calculateSalary() {
        System.out.println("The final salary - " + (salary + salary * 0.2));
    }
}
