package logic;

public class Student{
    protected String name;
    protected String registrationNumber;
    protected String fatherName;
    protected String currentAddress;
    protected String permanentAddress;
    protected String phoneNumber;
    protected String emailId;
    protected Course course;
    protected Payment payment;
    
    public String getName(){return name;}
    public void setName(String name){this.name=name;}
    public String getRegistrationNumber(){return registrationNumber;}
    public void setRegistrationNumber(String registrationNumber){this.registrationNumber=registrationNumber;}
    public String getFatherName(){return fatherName;}
    public void setFatherName(String fatherName){this.fatherName=fatherName;}
    public String getCurrentAddress(){return currentAddress;}
    public void setCurrentAddress(String currentAddress){this.currentAddress=currentAddress;}
    public String getPermanentAddress(){return permanentAddress;}
    public void setPermanentAddress(String permanentAddress){this.permanentAddress=permanentAddress;}
    public String getPhoneNumber(){return phoneNumber;}
    public void setPhoneNumber(String phoneNumber){this.phoneNumber=phoneNumber;}
    public String getEmailId(){return emailId;}
    public void setEmailId(String emailId){this.emailId=emailId;}
    public Course getCourse(){return course;}
    public void setCourse(Course course){this.course=course;}
    public Payment getPayment(){return payment;}
    public void setPayment(Payment payment){this.payment=payment;}


    public void printCourseAndPaymentDetails(String registrationNumber) {
        if(this.registrationNumber.equals(registrationNumber)){
            System.out.println("\nCourse Details");
            System.out.println("-------------------------");
            if (course != null) {
                System.out.println("Course Code   : " + course.getCode());
                System.out.println("Course Name   : " + course.getName());
                System.out.println("Course Credit : " + course.getCredit());
            }
            System.out.println("\nPayment Details");
            System.out.println("-------------------------");
            if (payment != null) {
                System.out.println("Payment ID : " + payment.getPaymentId());
                if (payment instanceof PaymentDD) {
                    PaymentDD dd = (PaymentDD) payment;
                    System.out.println("Payment Type : Demand Draft");
                    System.out.println("DD Number    : " + dd.getDdNumber());
                    System.out.println("Bank Name    : " + dd.getBankName());
                    System.out.println("Amount       : " + dd.getAmount());

                }
                else if (payment instanceof PaymentUPI) {
                    PaymentUPI upi = (PaymentUPI) payment;
                    System.out.println("Payment Type : UPI");
                    System.out.println("UPI ID       : " + upi.getUpiId());
                    System.out.println("Transaction ID : "+ upi.getTransactionId());
                    System.out.println("Amount       : " + upi.getAmount());

                } 
                else if (payment instanceof PaymentNB) {
                    PaymentNB nb = (PaymentNB) payment;
                    System.out.println("Payment Type : Net Banking");
                    System.out.println("Bank Name    : " + nb.getBankName());
                    System.out.println("Account No.  : " + nb.getAccountNumber());
                    System.out.println("Transaction ID : "+ nb.getTransactionId());
                    System.out.println("Amount       : " + nb.getAmount());
                }
            }
        }
      }
}
