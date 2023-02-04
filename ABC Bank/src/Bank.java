package src;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {

        Customer c = new Customer();
        int ch, n = 1;
        char choice;

        // input scanner
        while (n == 1) {
            Scanner sc = new Scanner(System.in);

            // Login
            System.out.println("*********Welcome to ABC Bank Ltd.*********");
            c.login();
            int inc = 1;
            while (inc == 1) {
                System.out.println(
                        "Please select the option\n1. Deposit\n2. Withdrawal\n3. Check balance\n4. Edit profile\n5. Change password\n6. Exit");
                ch = sc.nextInt();

                switch (ch) {
                    case 1:
                        c.deposit();
                        System.out.println("Do you want to continue (type Y or N)- ");
                        choice = sc.next().charAt(0);
                        if (choice == 'N') {
                            inc = 0;
                        }
                        break;
                    case 2:
                        c.withdrawal();
                        System.out.println("Do you want to continue (type Y or N)- ");
                        choice = sc.next().charAt(0);
                        if (choice == 'N') {
                            inc = 0;
                        }
                        break;
                    case 3:
                        c.checkBalance();
                        System.out.println("Do you want to continue (type Y or N)- ");
                        choice = sc.next().charAt(0);
                        if (choice == 'N') {
                            inc = 0;
                        }
                        break;
                    case 4:
                        c.editProfile();
                        System.out.println("Do you want to continue (type Y or N)- ");
                        choice = sc.next().charAt(0);
                        if (choice == 'N') {
                            inc = 0;
                        }
                        break;
                    case 5:
                        c.changePassword();
                        System.out.println("Do you want to continue (type Y or N)- ");
                        choice = sc.next().charAt(0);
                        if (choice == 'N') {
                            inc = 0;
                        }
                        break;
                    case 6:
                        inc = 0;
                        break;
                    default:
                        System.out.println("Invalid choice!");
                        break;
                }
                if (inc == 0)
                    break;
            }
            n = 0;
        }

        // Customer object for account validation
        Customer c2 = new Customer();
        c2.name = "Aniket";
        c2.username = "as7";
        c2.age = 22;
        c2.address = "Kolkata";
        c2.balance = 1000;
        c2.phone = 123456;
        c2.email = "abc@abc.com";
        c2.ssn = "123456789";
        c2.validateAge();
        c2.validateSSN();
    }
}