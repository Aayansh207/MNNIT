package logic;

public class PaymentDD extends Payment {
    protected String ddNumber;
    protected String bankName;
    protected double amount;

    public String getDdNumber(){return ddNumber;}
    public void setDdNumber(String ddNumber){this.ddNumber=ddNumber;}
    public String getBankName(){return bankName;}
    public void setBankName(String bankName){this.bankName=bankName;}
    public double getAmount(){return amount;}
    public void setAmount(double amount){this.amount=amount;}
}

