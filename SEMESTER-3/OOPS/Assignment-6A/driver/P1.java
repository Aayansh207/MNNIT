package driver;
import logic.*;

public class P1{
  public static void main(String[] args){
    UGStudent ug = new UGStudent();
    ug.setName("Rahul");
    ug.setRegistrationNumber("UG101");
    ug.setFatherName("Rajesh Kumar");
    ug.setCurrentAddress("Prayagraj");
    ug.setPermanentAddress("Lucknow");
    ug.setPhoneNumber("9876543210");
    ug.setEmailId("rahul@example.com");
    ug.setQualifyingDegree("12th");
    ug.setMarks(85.5);
    System.out.println("UG Student Details");
    System.out.println("Name: " + ug.getName());
    System.out.println("Registration Number: " + ug.getRegistrationNumber());
    System.out.println("Father's Name: " + ug.getFatherName());
    System.out.println("Current Address: " + ug.getCurrentAddress());
    System.out.println("Permanent Address: " + ug.getPermanentAddress());
    System.out.println("Phone: " + ug.getPhoneNumber());
    System.out.println("Email: " + ug.getEmailId());
    System.out.println("Qualifying Degree: " + ug.getQualifyingDegree());
    System.out.println("Marks: " + ug.getMarks());
  }
}
