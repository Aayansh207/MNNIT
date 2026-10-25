package driver;

import logic.*;

public class P4 {

    public static void main(String[] args) {

        Student[] students = new Student[10];

        students[0] = new UGStudent();
        students[0].setName("Rahul");
        students[0].setRegistrationNumber("S001");
        students[0].setFatherName("Rajesh Kumar");
        students[0].setCurrentAddress("Prayagraj");
        students[0].setPermanentAddress("Lucknow");
        students[0].setPhoneNumber("9876500001");
        students[0].setEmailId("rahul@gmail.com");

        UGCourse c1 = new UGCourse();
        c1.setCode("UG-1001");
        c1.setName("Data Structures");
        c1.setCredit(4);
        students[0].setCourse(c1);

        PaymentUPI p1 = new PaymentUPI();
        p1.setPaymentId("PAY001");
        p1.setUpiId("rahul@upi");
        p1.setTransactionId("TXN001");
        p1.setAmount(15000);
        students[0].setPayment(p1);


        students[1] = new UGStudent();
        students[1].setName("Aman");
        students[1].setRegistrationNumber("S002");
        students[1].setFatherName("Suresh Kumar");
        students[1].setCurrentAddress("Kanpur");
        students[1].setPermanentAddress("Kanpur");
        students[1].setPhoneNumber("9876500002");
        students[1].setEmailId("aman@gmail.com");

        UGCourse c2 = new UGCourse();
        c2.setCode("UG-1002");
        c2.setName("Operating Systems");
        c2.setCredit(4);
        students[1].setCourse(c2);

        PaymentDD p2 = new PaymentDD();
        p2.setPaymentId("PAY002");
        p2.setDdNumber("DD1002");
        p2.setBankName("SBI");
        p2.setAmount(18000);
        students[1].setPayment(p2);


        students[2] = new UGStudent();
        students[2].setName("Priya");
        students[2].setRegistrationNumber("S003");
        students[2].setFatherName("Mohan Singh");
        students[2].setCurrentAddress("Delhi");
        students[2].setPermanentAddress("Agra");
        students[2].setPhoneNumber("9876500003");
        students[2].setEmailId("priya@gmail.com");

        UGCourse c3 = new UGCourse();
        c3.setCode("UG-1003");
        c3.setName("Database Management");
        c3.setCredit(3);
        students[2].setCourse(c3);

        PaymentNB p3 = new PaymentNB();
        p3.setPaymentId("PAY003");
        p3.setBankName("HDFC Bank");
        p3.setAccountNumber("123456789003");
        p3.setTransactionId("TXN003");
        p3.setAmount(20000);
        students[2].setPayment(p3);


        students[3] = new UGStudent();
        students[3].setName("Neha");
        students[3].setRegistrationNumber("S004");
        students[3].setFatherName("Ramesh Gupta");
        students[3].setCurrentAddress("Jaipur");
        students[3].setPermanentAddress("Jaipur");
        students[3].setPhoneNumber("9876500004");
        students[3].setEmailId("neha@gmail.com");

        UGCourse c4 = new UGCourse();
        c4.setCode("UG-1004");
        c4.setName("Computer Networks");
        c4.setCredit(4);
        students[3].setCourse(c4);

        PaymentUPI p4 = new PaymentUPI();
        p4.setPaymentId("PAY004");
        p4.setUpiId("neha@upi");
        p4.setTransactionId("TXN004");
        p4.setAmount(16000);
        students[3].setPayment(p4);


        students[4] = new PGStudent();
        students[4].setName("Ravi");
        students[4].setRegistrationNumber("S005");
        students[4].setFatherName("Vijay Sharma");
        students[4].setCurrentAddress("Mumbai");
        students[4].setPermanentAddress("Patna");
        students[4].setPhoneNumber("9876500005");
        students[4].setEmailId("ravi@gmail.com");

        PGCourse c5 = new PGCourse();
        c5.setCode("PG-2001");
        c5.setName("Advanced Java");
        c5.setCredit(4);
        students[4].setCourse(c5);

        PaymentDD p5 = new PaymentDD();
        p5.setPaymentId("PAY005");
        p5.setDdNumber("DD1005");
        p5.setBankName("PNB");
        p5.setAmount(25000);
        students[4].setPayment(p5);


        students[5] = new PGStudent();
        students[5].setName("Anjali");
        students[5].setRegistrationNumber("S006");
        students[5].setFatherName("Arun Verma");
        students[5].setCurrentAddress("Bhopal");
        students[5].setPermanentAddress("Bhopal");
        students[5].setPhoneNumber("9876500006");
        students[5].setEmailId("anjali@gmail.com");

        PGCourse c6 = new PGCourse();
        c6.setCode("PG-2002");
        c6.setName("Machine Learning");
        c6.setCredit(4);
        students[5].setCourse(c6);

        PaymentUPI p6 = new PaymentUPI();
        p6.setPaymentId("PAY006");
        p6.setUpiId("anjali@upi");
        p6.setTransactionId("TXN006");
        p6.setAmount(30000);
        students[5].setPayment(p6);


        students[6] = new PGStudent();
        students[6].setName("Karan");
        students[6].setRegistrationNumber("S007");
        students[6].setFatherName("Ajay Singh");
        students[6].setCurrentAddress("Noida");
        students[6].setPermanentAddress("Meerut");
        students[6].setPhoneNumber("9876500007");
        students[6].setEmailId("karan@gmail.com");

        PGCourse c7 = new PGCourse();
        c7.setCode("PG-2003");
        c7.setName("Cloud Computing");
        c7.setCredit(3);
        students[6].setCourse(c7);

        PaymentNB p7 = new PaymentNB();
        p7.setPaymentId("PAY007");
        p7.setBankName("ICICI Bank");
        p7.setAccountNumber("123456789007");
        p7.setTransactionId("TXN007");
        p7.setAmount(28000);
        students[6].setPayment(p7);


        students[7] = new UGStudent();
        students[7].setName("Pooja");
        students[7].setRegistrationNumber("S008");
        students[7].setFatherName("Rakesh Yadav");
        students[7].setCurrentAddress("Varanasi");
        students[7].setPermanentAddress("Varanasi");
        students[7].setPhoneNumber("9876500008");
        students[7].setEmailId("pooja@gmail.com");

        UGCourse c8 = new UGCourse();
        c8.setCode("UG-1005");
        c8.setName("Software Engineering");
        c8.setCredit(3);
        students[7].setCourse(c8);

        PaymentUPI p8 = new PaymentUPI();
        p8.setPaymentId("PAY008");
        p8.setUpiId("pooja@upi");
        p8.setTransactionId("TXN008");
        p8.setAmount(17000);
        students[7].setPayment(p8);


        students[8] = new PGStudent();
        students[8].setName("Vikas");
        students[8].setRegistrationNumber("S009");
        students[8].setFatherName("Dinesh Kumar");
        students[8].setCurrentAddress("Gurgaon");
        students[8].setPermanentAddress("Gurgaon");
        students[8].setPhoneNumber("9876500009");
        students[8].setEmailId("vikas@gmail.com");

        PGCourse c9 = new PGCourse();
        c9.setCode("PG-2004");
        c9.setName("Artificial Intelligence");
        c9.setCredit(4);
        students[8].setCourse(c9);

        PaymentDD p9 = new PaymentDD();
        p9.setPaymentId("PAY009");
        p9.setDdNumber("DD1009");
        p9.setBankName("Axis Bank");
        p9.setAmount(35000);
        students[8].setPayment(p9);


        students[9] = new UGStudent();
        students[9].setName("Simran");
        students[9].setRegistrationNumber("S010");
        students[9].setFatherName("Manoj Kapoor");
        students[9].setCurrentAddress("Chandigarh");
        students[9].setPermanentAddress("Chandigarh");
        students[9].setPhoneNumber("9876500010");
        students[9].setEmailId("simran@gmail.com");

        UGCourse c10 = new UGCourse();
        c10.setCode("UG-1006");
        c10.setName("Object Oriented Programming");
        c10.setCredit(4);
        students[9].setCourse(c10);

        PaymentNB p10 = new PaymentNB();
        p10.setPaymentId("PAY010");
        p10.setBankName("HDFC Bank");
        p10.setAccountNumber("123456789010");
        p10.setTransactionId("TXN010");
        p10.setAmount(19000);
        students[9].setPayment(p10);


        for (int i = 0; i < students.length; i++) {
            System.out.println("\n======================================");
            System.out.println("        STUDENT " + (i + 1));
            System.out.println("======================================");

            System.out.println("Name               : "+students[i].getName());
            System.out.println("Registration No.   : "+students[i].getRegistrationNumber());
            System.out.println("Father's Name      : "+students[i].getFatherName());
            System.out.println("Current Address    : "+students[i].getCurrentAddress());
            System.out.println("Permanent Address  : "+students[i].getPermanentAddress());
            System.out.println("Phone              : "+students[i].getPhoneNumber());
            System.out.println("Email              : "+students[i].getEmailId());
            students[i].printCourseAndPaymentDetails(students[i].getRegistrationNumber());
        }
    }
}

