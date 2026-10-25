package logic;

public class ProductionWorker extends Employee7 {

    protected int shift;
    protected double hourlyPayRate;

    public ProductionWorker() {
        super();
    }

    public ProductionWorker(String employeeName,
                            String employeeNumber,
                            String hireDate,
                            int shift,
                            double hourlyPayRate) {

        super(employeeName, employeeNumber, hireDate);

        setShift(shift);
        setHourlyPayRate(hourlyPayRate);
    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        if (shift == 1 || shift == 2) {
            this.shift = shift;
        } else {
            throw new IllegalArgumentException(
                "Shift must be 1 (Day) or 2 (Night)."
            );
        }
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        if (hourlyPayRate >= 0) {
            this.hourlyPayRate = hourlyPayRate;
        } else {
            throw new IllegalArgumentException(
                "Hourly pay rate cannot be negative."
            );
        }
    }

    public String getShiftName() {
        if (shift == 1) {
            return "Day Shift";
        } else {
            return "Night Shift";
        }
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nShift: " + shift +
               " (" + getShiftName() + ")" +
               "\nHourly Pay Rate: $" +
               String.format("%.2f", hourlyPayRate);
    }
}

