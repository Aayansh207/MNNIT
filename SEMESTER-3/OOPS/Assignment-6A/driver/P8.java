package driver;

import logic.ShiftSupervisor;

public class P8 {

    public static void main(String[] args) {

        ShiftSupervisor supervisor = new ShiftSupervisor(
            "Rajesh Kumar",
            "789C",
            "10-06-2022",
            75000.00,
            10000.00
        );

        System.out.println("===== SHIFT SUPERVISOR DETAILS =====");
        System.out.println(supervisor);

        System.out.println("\n===== ACCESSOR METHODS =====");
        System.out.println("Name: " +
                           supervisor.getEmployeeName());
        System.out.println("Employee Number: " +
                           supervisor.getEmployeeNumber());
        System.out.println("Hire Date: " +
                           supervisor.getHireDate());
        System.out.println("Annual Salary: $" +
                           supervisor.getAnnualSalary());
        System.out.println("Annual Production Bonus: $" +
                           supervisor.getAnnualProductionBonus());

        System.out.println("\n===== AFTER UPDATING =====");

        supervisor.setAnnualSalary(80000.00);
        supervisor.setAnnualProductionBonus(12000.00);

        System.out.println(supervisor);
    }
}

