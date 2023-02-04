package src;

public class Savings extends Account {
    float minimumBalance = 500;

    public void display() {
        System.out.println("Account ID - " + this.accountID);
        System.out.println("Minimum balance - " + this.minimumBalance);
        System.out.println("Description - " + this.description);
    }
}
