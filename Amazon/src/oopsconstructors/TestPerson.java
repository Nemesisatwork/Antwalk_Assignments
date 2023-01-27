package oopsconstructors;

public class TestPerson {

    public static void main(String args[]) {
        Person p1 = new Person();
        p1.name = "Upasana";
        p1.age = 32;
        p1.address = "Bangalore";
        Person p2 = new Person("Mohit", 21, "Kolkata");
        Person p3 = new Person("Aniket", 22, "Kolkata");

        Person[] p = new Person[3];
        p[0] = p1;
        p[1] = p2;
        p[2] = p3;
        for (int i = 0; i < 3; i++) {
            System.out.println("Name - " + p[i].name + "\nAge - " + p[i].age + "\nAddress - " + p[i].address);
        }
    }
}
