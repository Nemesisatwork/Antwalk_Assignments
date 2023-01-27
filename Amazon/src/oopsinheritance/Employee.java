package oopsinheritance;

public class Employee extends Person {

    int empId;
    int salary = 30000;

    public Employee(String name, int age, String address, int empId) {

        super(name, age, address);
        this.empId = empId;
        System.out.println("Employee constructor");
    }

    public Employee() {
    }

    public void calculateSalary() {
        System.out.println("The final salary - " + (salary + salary * 0.1));
    }

}
