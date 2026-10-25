package logic;

import java.time.LocalDate;

public class StudentRecord extends PersonalRecord {
    private String registrationId;

    public StudentRecord(String name, String fatherName,
                         LocalDate dateOfBirth, String registrationId) {
        super(name, fatherName, dateOfBirth);
        this.registrationId = registrationId;
    }

    @Override
    public void printRecord() {
        System.out.println("Role           : Student");
        System.out.println("Name           : " + name);
        System.out.println("Father's Name  : " + fatherName);
        System.out.println("Date of Birth  : " + dateOfBirth);
        System.out.println("Age            : " + calculateAge());
        System.out.println("Registration ID: " + registrationId);
        System.out.println("-----------------------------------");
    }
}

