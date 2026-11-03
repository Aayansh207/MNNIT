import java.util.Scanner;

abstract class Payment{
    protected double amount;
    Payment(double amount){
        this.amount=amount;
    }
    abstract void processPayment(double transaction) throws PaymentException;
    void displayAmount(){
        System.out.println("Your amount is : "+amount);
    }
}

interface Refundable{
    void refund(double amount);
    default void displayLogStatus(){
        System.out.println("The payment is refundable");
    }
}

interface TransactionLogger{
    void logTransaction();
    default void displayLogStatus(){
        System.out.println("This is transaction logger interface");
    }
}

class CreditCardPayment extends Payment implements Refundable,TransactionLogger{
    CreditCardPayment(double amount){
        super(amount);
    }
    @Override
    public void displayLogStatus(){
        System.out.println("This is overridden logger");
    }
    void processPayment(double transaction) throws PaymentException{
        if (transaction <= 0 || transaction > super.amount) {
            throw new PaymentException();
        }
        Refundable.super.displayLogStatus();
        TransactionLogger.super.displayLogStatus();
    }
    public void refund(double amount){}
    public void logTransaction(){}
}

class UPIPayment extends Payment implements Refundable,TransactionLogger{
    UPIPayment(double amount){
        super(amount);
    }
    @Override
    public void displayLogStatus(){
        System.out.println("This is overridden logger");
    }
    void processPayment(double transaction) throws PaymentException{
        if(super.amount<transaction){
            throw new PaymentException();
        }
        Refundable.super.displayLogStatus();
        TransactionLogger.super.displayLogStatus();
    }
    public void refund(double amount){}
    public void logTransaction(){}
}

class PaymentException extends Exception{
    PaymentException(){
        super("The balance is less than amount");
    };
}
class WrongTypeException extends Exception{
    WrongTypeException(){
        super("Please choose correct type");
    }
}

public class Main{
    public static void main(String[] args) throws WrongTypeException{
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose transaction mode : ");
        System.out.println("1 : Credit card");
        System.out.println("2 : UPI");
        int type=sc.nextInt();
        Payment payment;
        if(type==1){
            payment=new CreditCardPayment(1000);
        }
        else if(type==2){
            payment=new UPIPayment(1000);
        }
        else{
            sc.close();
            throw new WrongTypeException();
        }
        System.out.println("Enter the amount of transaction");
        int amount=sc.nextInt();
        try{
            payment.processPayment(amount);
        }
        catch(Exception e){
            System.out.println("Payment rejected, balance is less than requested amount");
        }
        finally{
            sc.close();
        }
    }
}