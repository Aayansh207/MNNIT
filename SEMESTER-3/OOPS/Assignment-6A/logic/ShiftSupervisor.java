package logic;

public class ShiftSupervisor extends Employee7 {

    protected double annualSalary;
    protected double annualProductionBonus;

    public ShiftSupervisor() {
        super();
    }

    public ShiftSupervisor(String employeeName,
                           String employeeNumber,
                           String hireDate,
                           double annualSalary,
                           double annualProductionBonus) {

        super(employeeName, employeeNumber, hireDate);

        setAnnualSalary(annualSalary);
        setAnnualProductionBonus(annualProductionBonus);
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        if (annualSalary >= 0) {
            this.annualSalary = annualSalary;
        } else {
            throw new IllegalArgumentException(
                "Annual salary cannot be negative."
            );
        }
    }

    public double getAnnualProductionBonus() {
        return annualProductionBonus;
    }

    public void setAnnualProductionBonus(double annualProductionBonus) {
        if (annualProductionBonus >= 0) {
            this.annualProductionBonus = annualProductionBonus;
        } else {
            throw new IllegalArgumentException(
                "Annual production bonus cannot be negative."
            );
        }
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nAnnual Salary: $" +
               String.format("%.2f", annualSalary) +
               "\nAnnual Production Bonus: $" +
               String.format("%.2f", annualProductionBonus);
    }
}

