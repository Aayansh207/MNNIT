package logic;

public class PaymentUPI extends Payment {
    protected String upiId;
    protected String transactionId;
    protected double amount;

    public String getUpiId(){return upiId;} 
    public void setUpiId(String upiId){this.upiId=upiId;}
    public String getTransactionId(){return transactionId;}
    public void setTransactionId(String transactionId){this.transactionId=transactionId;}
    public double getAmount(){return amount;}
    public void setAmount(double amount){this.amount=amount;}
}

