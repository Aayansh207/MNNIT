package driver;

import logic.*;

public class P6 {
    public static void main(String[] args) {

        HOD hod = new HOD(
                "E001",
                "Dr. Rajesh Kumar",
                "Computer Science",
                "12-05-1975",
                "Professor",
                2002,
                "9876543210",
                "Computer Science",
                5
        );

        DUGC dugc = new DUGC(
                "E002",
                "Dr. Priya Sharma",
                "Computer Science",
                "15-08-1980",
                "Associate Professor",
                2008,
                "9876543211",
                "DUGC",
                "Undergraduate Academic Planning"
        );

        DMPC dmpc = new DMPC(
                "E003",
                "Dr. Amit Singh",
                "Computer Science",
                "20-02-1978",
                "Professor",
                2005,
                "9876543212",
                "DMPC",
                "Master Program Planning"
        );

        DDPC ddpc = new DDPC(
                "E004",
                "Dr. Neha Gupta",
                "Computer Science",
                "10-11-1982",
                "Assistant Professor",
                2012,
                "9876543213",
                "DDPC",
                "Doctoral Program Planning"
        );

        SkilledStaff skilledStaff = new SkilledStaff(
                "E005",
                "Ravi Verma",
                "Computer Science",
                "25-03-1985",
                "Technician",
                2010,
                "9876543214",
                "Technical Expert"
        );

        UnskilledStaff unskilledStaff = new UnskilledStaff(
                "E006",
                "Mohan Yadav",
                "Computer Science",
                "05-07-1988",
                "Helper",
                2015,
                "9876543215",
                "General Maintenance"
        );

        System.out.println("========== EMPLOYEE DETAILS ==========\n");

        System.out.println(hod);
        System.out.println();

        System.out.println(dugc);
        System.out.println();

        System.out.println(dmpc);
        System.out.println();

        System.out.println(ddpc);
        System.out.println();

        System.out.println(skilledStaff);
        System.out.println();

        System.out.println(unskilledStaff);
    }
}

