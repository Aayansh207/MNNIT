package Customers;

public class AllCustomers {
    private Customer[] customers;
    private int count;

    public AllCustomers(int capacity) {
        customers = new Customer[capacity];
        count = 0;
    }

    public void addCustomer(Customer customer) {
        if(count<customers.length){customers[count++]=customer;} 
        else{System.out.println("Customer list is full. Cannot add more customers.");}
    }

    public Customer[] getCustomers() {
        return customers;
    }

    public Customer getCustomer(String name) {
        for(int i=0;i<count;i++){
            if(customers[i].getName().equals(name)){
                return customers[i];
            }
        }
        System.out.println("Customer not found.");
        return null;
    }

    public int getCount() {
        return count;
    }

    public void displayAllCustomers() {
        if(count==0){
            System.out.println("No customers to display.");
            return;
        }
        System.out.println("All Customers:");
        for(int i=0;i<count;i++){
            System.out.println("Customer Name: " + customers[i].getName());
            System.out.println("Account Balance: ₹" + customers[i].getAccount().getBalance());
            System.out.println("---------------------------");
        }
    }
}