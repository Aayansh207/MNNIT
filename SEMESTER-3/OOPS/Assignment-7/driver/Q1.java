package driver;

import logic.PersonalRecord;
import logic.PrintableRecord;
import logic.StudentRecord;
import logic.StaffRecord;

import java.time.LocalDate;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of records (minimum 4): ");
        int n = sc.nextInt();
        sc.nextLine();
        if (n < 4) {
            System.out.println("Please enter at least 4 records.");
            sc.close();
            return;
        }

        PersonalRecord[] records = new PersonalRecord[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nRecord " + (i + 1));
            System.out.print("Enter role (Student/Staff): ");
            String role = sc.nextLine();
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            System.out.print("Enter father's name: ");
            String fatherName = sc.nextLine();
            System.out.print("Enter date of birth (yyyy-mm-dd): ");
            LocalDate dob = LocalDate.parse(sc.nextLine());
            if (role.equalsIgnoreCase("Student")) {
                System.out.print("Enter registration ID: ");
                String registrationId = sc.nextLine();
                records[i]=new StudentRecord(name, fatherName, dob, registrationId);
            }
            else if (role.equalsIgnoreCase("Staff")){
                System.out.print("Enter employee ID: ");
                String employeeId = sc.nextLine();
                records[i]=new StaffRecord(name, fatherName, dob, employeeId);
            }
            else{
                System.out.println("Invalid role. Please enter Student or Staff.");
                i--;
            }
        }

        System.out.println("\n========== ALL PERSONAL RECORDS ==========\n");
        for (PrintableRecord record : records) {
            record.printRecord();
        }

        sc.close();
    }
}

