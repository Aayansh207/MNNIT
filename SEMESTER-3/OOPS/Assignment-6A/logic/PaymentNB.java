package logic;

public class PaymentNB extends Payment {
    protected String bankName;
    protected String accountNumber;
    protected String transactionId;
    protected double amount;

    public String getBankName(){return bankName;}
    public void setBankName(String bankName){this.bankName=bankName;}
    public String getAccountNumber(){return accountNumber;}
    public void setAccountNumber(String accountNumber){this.accountNumber=accountNumber;}
    public String getTransactionId(){return transactionId;}
    public void setTransactionId(String transactionId){this.transactionId=transactionId;}
    public double getAmount(){return amount;}
    public void setAmount(double amount){this.amount=amount;}
}

