package calculator;

import java.util.Scanner;

public class Test extends Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 1;
        while (n == 1) {
            System.out.println(
                    "Welcome to the calculator.\nWhat would you like to do?\n1. +\n2. -\n3. *\n4. /\nEnter your choice - ");
            Calculator cl = new Calculator();
            String c;
            float a, b;

            c = sc.next();

            System.out.println("Enter two number- ");
            a = sc.nextFloat();
            b = sc.nextFloat();

            switch (c) {
                case "+":
                    cl.add(a, b);
                    break;
                case "-":
                    cl.sub(a, b);
                    break;
                case "*":
                    cl.mul(a, b);
                    break;
                case "/":
                    cl.div(a, b);
                    break;
                default:
                    System.out.println("Exiting");
                    break;
            }
            System.out.println("Do you want to exit (0 for yes/1 for no)- ");
            n = sc.nextInt();
        }
        sc.close();
    }
}
