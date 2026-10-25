package logic;

public class TeamLeader extends ProductionWorker {

    protected double monthlyBonus;
    protected int requiredTrainingHours;
    protected int attendedTrainingHours;

    public TeamLeader() {
        super();
    }

    public TeamLeader(String employeeName,
                      String employeeNumber,
                      String hireDate,
                      int shift,
                      double hourlyPayRate,
                      double monthlyBonus,
                      int requiredTrainingHours,
                      int attendedTrainingHours) {

        super(employeeName, employeeNumber, hireDate,
              shift, hourlyPayRate);

        setMonthlyBonus(monthlyBonus);
        setRequiredTrainingHours(requiredTrainingHours);
        setAttendedTrainingHours(attendedTrainingHours);
    }

    public double getMonthlyBonus() {
        return monthlyBonus;
    }

    public void setMonthlyBonus(double monthlyBonus) {
        if (monthlyBonus >= 0) {
            this.monthlyBonus = monthlyBonus;
        } else {
            throw new IllegalArgumentException(
                "Monthly bonus cannot be negative."
            );
        }
    }

    public int getRequiredTrainingHours() {
        return requiredTrainingHours;
    }

    public void setRequiredTrainingHours(int requiredTrainingHours) {
        if (requiredTrainingHours >= 0) {
            this.requiredTrainingHours = requiredTrainingHours;
        } else {
            throw new IllegalArgumentException(
                "Required training hours cannot be negative."
            );
        }
    }

    public int getAttendedTrainingHours() {
        return attendedTrainingHours;
    }

    public void setAttendedTrainingHours(int attendedTrainingHours) {
        if (attendedTrainingHours >= 0) {
            this.attendedTrainingHours = attendedTrainingHours;
        } else {
            throw new IllegalArgumentException(
                "Attended training hours cannot be negative."
            );
        }
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nMonthly Bonus: $" +
               String.format("%.2f", monthlyBonus) +
               "\nRequired Training Hours: " +
               requiredTrainingHours +
               "\nAttended Training Hours: " +
               attendedTrainingHours;
    }
}

