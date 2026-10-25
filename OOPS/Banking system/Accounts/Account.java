package Accounts;

public abstract class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }
    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public double getBalance() {
        return balance;
    }
    
    public abstract void calculateInterest();
}