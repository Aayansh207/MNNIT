package Accounts;

public class SavingsAccount extends Account {

    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public void calculateInterest() {
        double interest = getBalance() * 0.04;

        System.out.println("Savings Account Interest: ₹" + interest);
        System.out.println("Balance after interest: ₹" + (getBalance() + interest));
    }
}