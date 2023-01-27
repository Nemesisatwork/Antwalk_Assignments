package oopsinheritance;

public class Designer extends Employee {

    public void calculateSalary() {
        System.out.println("The final salary - " + (salary + salary * 0.3));
    }

}
