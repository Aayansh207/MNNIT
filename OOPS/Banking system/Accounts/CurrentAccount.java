package Accounts;

public class CurrentAccount extends Account {

    public CurrentAccount(double balance) {
        super(balance);
    }

    @Override
    public void calculateInterest() {
        System.out.println("Current Account does not earn interest.");
        System.out.println("Current Balance: ₹" + getBalance());
    }
}