package logic;

import java.time.LocalDate;

public class StaffRecord extends PersonalRecord {
    private String employeeId;

    public StaffRecord(String name, String fatherName,
                       LocalDate dateOfBirth, String employeeId) {
        super(name, fatherName, dateOfBirth);
        this.employeeId = employeeId;
    }

    @Override
    public void printRecord() {
        System.out.println("Role           : Staff");
        System.out.println("Name           : " + name);
        System.out.println("Father's Name  : " + fatherName);
        System.out.println("Date of Birth  : " + dateOfBirth);
        System.out.println("Age            : " + calculateAge());
        System.out.println("Employee ID    : " + employeeId);
        System.out.println("-----------------------------------");
    }
}

