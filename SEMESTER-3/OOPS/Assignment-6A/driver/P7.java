package driver;

import logic.ProductionWorker;

public class P7 {

    public static void main(String[] args) {

        ProductionWorker worker = new ProductionWorker(
            "Rahul Sharma",
            "123A",
            "15-08-2024",
            1,
            25.50
        );

        System.out.println("===== PRODUCTION WORKER DETAILS =====");
        System.out.println(worker);

        System.out.println("\n===== ACCESSOR METHODS =====");
        System.out.println("Name: " + worker.getEmployeeName());
        System.out.println("Employee Number: " +
                           worker.getEmployeeNumber());
        System.out.println("Hire Date: " + worker.getHireDate());
        System.out.println("Shift: " + worker.getShift());
        System.out.println("Shift Name: " + worker.getShiftName());
        System.out.println("Hourly Pay Rate: $" +
                           worker.getHourlyPayRate());

        System.out.println("\n===== MUTATOR METHODS =====");

        worker.setEmployeeName("Amit Kumar");
        worker.setEmployeeNumber("456B");
        worker.setHireDate("20-01-2025");
        worker.setShift(2);
        worker.setHourlyPayRate(30.75);

        System.out.println(worker);
    }
}

