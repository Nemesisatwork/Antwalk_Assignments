package src;

import java.util.Scanner;

public class Customer implements Validation {

    String name, username, pass, ssn, address, email;
    int age;
    float balance = 0;
    long phone;

    // scanner for input
    Scanner sc = new Scanner(System.in);

    // method for login
    public void login() {

        // username
        System.out.println("Enter your username - ");
        this.username = sc.next();

        // password
        System.out.println("Enter your password - ");
        this.pass = sc.next();
    }

    // method for depositing into the account
    public void deposit() {

        System.out.println("Enter amount to be deposited - ");
        this.balance += sc.nextFloat();

        System.out.println("Deposit successfull!\nCurrent balance - " + this.balance);
    }

    // method for withdrawal of money
    public void withdrawal() {
        float amt;
        System.out.println("Enter amount for withdrawal - ");
        amt = sc.nextFloat();
        if (amt > this.balance)
            System.out.println("Exceeded balance, cannot withdraw");
        else {
            this.balance -= amt;
            System.out.println("Withdrawal successfull!\nCurrent balance - " + this.balance);
        }
    }

    // method for checking account balance
    public void checkBalance() {
        System.out.println("Your current balance is - " + this.balance);
    }

    // method for editing profile
    public void editProfile() {
        System.out.println("Enter your name - ");
        this.name = sc.next();
        System.out.println("Enter your username - ");
        this.username = sc.next();
        System.out.println("Enter your email - ");
        this.email = sc.next();
        System.out.println("Enter your ssn - ");
        this.ssn = sc.next();
        System.out.println("Enter your address - ");
        this.address = sc.next();
        System.out.println("Enter your age - ");
        this.age = sc.nextInt();
        System.out.println("Enter your phone - ");
        this.phone = sc.nextLong();
    }

    // method for changing password
    public void changePassword() {
        System.out.println("Enter your new password - ");
        this.pass = sc.next();
        System.out.println("Your password has been changed successfully");
    }

    // Validation interface methods

    // SSN validation
    public void validateSSN() {
        if (this.ssn.length() == 9) {
            System.out.println("SSN validated");
        } else {
            System.out.println("SSN failed to validate");
        }
    }

    // Age validation
    public void validateAge() {
        if (this.age > 18) {
            System.out.println("Age validated");
        } else {
            System.out.println("Age not validated");
        }
    }

}
