package driver;
import logic.*;

public class P5 {
    public static void main(String[] args) {

        Employee[] employees = new Employee[5];


        Faculty f1 = new Faculty();

        f1.setEmployeeId("E001");
        f1.setName("Dr. Rajesh Kumar");
        f1.setDepartment("Computer Science");
        f1.setDob("15-05-1980");
        f1.setDesignation("Assistant Professor");
        f1.setYearOfJoining(2010);
        f1.setPhoneNumber("9876500001");

        f1.addSubject("Data Structures");
        f1.addSubject("Java Programming");

        f1.addLab("Data Structures Lab");
        f1.addLab("Java Lab");

        employees[0] = f1;


        Faculty f2 = new Faculty();

        f2.setEmployeeId("E002");
        f2.setName("Dr. Priya Sharma");
        f2.setDepartment("Information Technology");
        f2.setDob("20-08-1982");
        f2.setDesignation("Associate Professor");
        f2.setYearOfJoining(2012);
        f2.setPhoneNumber("9876500002");

        f2.addSubject("Database Management");
        f2.addSubject("Operating Systems");

        f2.addLab("DBMS Lab");
        f2.addLab("Operating Systems Lab");

        employees[1] = f2;


        Faculty f3 = new Faculty();

        f3.setEmployeeId("E003");
        f3.setName("Dr. Amit Singh");
        f3.setDepartment("Computer Science");
        f3.setDob("10-11-1978");
        f3.setDesignation("Professor");
        f3.setYearOfJoining(2008);
        f3.setPhoneNumber("9876500003");

        f3.addSubject("Computer Networks");
        f3.addSubject("Operating Systems");

        f3.addLab("Networking Lab");
        f3.addLab("Linux Lab");

        employees[2] = f3;


        OfficeStaff os1 = new OfficeStaff();

        os1.setEmployeeId("E004");
        os1.setName("Ramesh Gupta");
        os1.setDepartment("Administration");
        os1.setDob("05-03-1985");
        os1.setDesignation("Office Assistant");
        os1.setYearOfJoining(2015);
        os1.setPhoneNumber("9876500004");

        os1.addSkill("Typing");
        os1.addSkill("MS Office");
        os1.addSkill("Data Entry");

        employees[3] = os1;


        OfficeStaff os2 = new OfficeStaff();

        os2.setEmployeeId("E005");
        os2.setName("Suresh Yadav");
        os2.setDepartment("Technical Support");
        os2.setDob("12-07-1987");
        os2.setDesignation("Technician");
        os2.setYearOfJoining(2017);
        os2.setPhoneNumber("9876500005");

        os2.addSkill("Technician");
        os2.addSkill("Hardware Repair");
        os2.addSkill("Networking");

        employees[4] = os2;



        for (int i = 0; i < employees.length; i++) {

            System.out.println();
            System.out.println("========================================");
            System.out.println("          EMPLOYEE " + (i + 1));
            System.out.println("========================================");

            employees[i].printDetails(
                employees[i].getEmployeeId()
            );
        }
    }
}

