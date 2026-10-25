package driver;

import logic.PaymentDD;
import logic.PaymentUPI;
import logic.PaymentNB;

public class P3 {
    public static void main(String[] args) {
        PaymentDD dd = new PaymentDD();
        dd.setPaymentId("PAY001");
        dd.setDdNumber("DD12345");
        dd.setBankName("SBI");
        dd.setAmount(25000);
        System.out.println("Demand Draft Payment");
        System.out.println("Payment ID : " + dd.getPaymentId());
        System.out.println("DD Number  : " + dd.getDdNumber());
        System.out.println("Bank Name  : " + dd.getBankName());
        System.out.println("Amount     : " + dd.getAmount());
        System.out.println();
        PaymentUPI upi = new PaymentUPI();
        upi.setPaymentId("PAY002");
        upi.setUpiId("student@upi");
        upi.setTransactionId("TXN123456");
        upi.setAmount(15000);
        System.out.println("UPI Payment");
        System.out.println("Payment ID     : " + upi.getPaymentId());
        System.out.println("UPI ID         : " + upi.getUpiId());
        System.out.println("Transaction ID : " + upi.getTransactionId());
        System.out.println("Amount         : " + upi.getAmount());
        System.out.println();
        PaymentNB nb = new PaymentNB();
        nb.setPaymentId("PAY003");
        nb.setBankName("HDFC Bank");
        nb.setAccountNumber("1234567890");
        nb.setTransactionId("TXN789012");
        nb.setAmount(30000);
        System.out.println("Net Banking Payment");
        System.out.println("Payment ID     : " + nb.getPaymentId());
        System.out.println("Bank Name      : " + nb.getBankName());
        System.out.println("Account Number : " + nb.getAccountNumber());
        System.out.println("Transaction ID : " + nb.getTransactionId());
        System.out.println("Amount         : " + nb.getAmount());
    }
}

