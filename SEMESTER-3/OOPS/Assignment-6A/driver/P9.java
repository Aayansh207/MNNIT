package driver;

import logic.TeamLeader;

public class P9 {

    public static void main(String[] args) {

        TeamLeader leader = new TeamLeader(
            "Ankit Singh",
            "321D",
            "15-03-2023",
            2,
            28.50,
            500.00,
            40,
            32
        );

        System.out.println("===== TEAM LEADER DETAILS =====");
        System.out.println(leader);

        System.out.println("\n===== ACCESSOR METHODS =====");
        System.out.println("Name: " +
                           leader.getEmployeeName());
        System.out.println("Employee Number: " +
                           leader.getEmployeeNumber());
        System.out.println("Hire Date: " +
                           leader.getHireDate());
        System.out.println("Shift: " +
                           leader.getShiftName());
        System.out.println("Hourly Pay Rate: $" +
                           leader.getHourlyPayRate());
        System.out.println("Monthly Bonus: $" +
                           leader.getMonthlyBonus());
        System.out.println("Required Training Hours: " +
                           leader.getRequiredTrainingHours());
        System.out.println("Attended Training Hours: " +
                           leader.getAttendedTrainingHours());

        System.out.println("\n===== AFTER UPDATING =====");

        leader.setMonthlyBonus(600.00);
        leader.setRequiredTrainingHours(50);
        leader.setAttendedTrainingHours(45);

        System.out.println(leader);
    }
}

