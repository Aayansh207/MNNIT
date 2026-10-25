import java.util.Scanner;

import Accounts.CurrentAccount;
import Accounts.SavingsAccount;
import Customers.*;

public class Bank{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        AllCustomers allCustomers=new AllCustomers(5);
        while(true){
            System.out.println("Enter your choice : ");
            System.out.println("1. Add Customer");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Display Account");
            System.out.println("5. Calculate Interest");
            System.out.println("6. Display All Customers");
            System.out.println("7. Exit");
            int query=sc.nextInt();

            if(query==1){
                System.out.println("Enter customer name: ");
                String name=sc.next();
                System.out.println("Enter initial balance: ");
                double balance=sc.nextDouble();
                System.out.println("Enter account type (1 for Savings, 2 for Current): ");
                int accountType=sc.nextInt();
                if(accountType==1){
                    Customer customer=new Customer(name, new SavingsAccount(balance));
                    allCustomers.addCustomer(customer);
                }
                else if(accountType==2){
                    Customer customer=new Customer(name, new CurrentAccount(balance));
                    allCustomers.addCustomer(customer);
                }
                else{
                    System.out.println("Invalid account type. Please try again.");
                }
            }
            else if(query==2){
                System.out.println("Enter customer name: ");
                String name=sc.next();
                System.out.println("Enter amount to deposit: ");
                double amount=sc.nextDouble();
                Customer customer=allCustomers.getCustomer(name);
                if(customer!=null){
                    customer.deposit(amount);
                }
                else{
                    System.out.println("Customer not found.");
                }
            }
            else if(query==3){
                System.out.println("Enter customer name: ");
                String name=sc.next();
                System.out.println("Enter amount to withdraw: ");
                double amount=sc.nextDouble();
                Customer customer=allCustomers.getCustomer(name);
                if(customer!=null){
                    customer.withdraw(amount);
                }
                else{
                    System.out.println("Customer not found.");
                }
            }
            else if(query==4){
                System.out.println("Enter customer name: ");
                String name=sc.next();
                Customer customer=allCustomers.getCustomer(name);
                if(customer!=null){
                    System.out.println("Customer Name: " + customer.getName());
                    System.out.println("Account Balance: ₹" + customer.getAccount().getBalance());
                }
                else{
                    System.out.println("Customer not found.");
                }
            }
            else if(query==5){
                System.out.println("Enter customer name: ");
                String name=sc.next();
                Customer customer=allCustomers.getCustomer(name);
                if(customer!=null){
                    customer.calculateInterest();
                }
                else{
                    System.out.println("Customer not found.");
                }
            }
            else if(query==6){
                allCustomers.displayAllCustomers();
            }
            else if(query==7){break;}
        }

        sc.close();
    }
}