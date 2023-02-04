package src;

public abstract class Account {
    int accountID = 1001;
    float minimumBalance;
    String description = "This is an account";

    public abstract void display();
}
