package src;

public class Current extends Account {
    float minimumBalance = 0;

    public void display() {
        System.out.println("Account ID - " + this.accountID);
        System.out.println("Minimum balance - " + this.minimumBalance);
        System.out.println("Description - " + this.description);
    }
}
