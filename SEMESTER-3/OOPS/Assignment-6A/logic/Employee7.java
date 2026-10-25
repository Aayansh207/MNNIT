package logic;

public class Employee7 {

    protected String employeeName;
    protected String employeeNumber;
    protected String hireDate;

    public Employee7() {
    }

    public Employee7(String employeeName, String employeeNumber,
                     String hireDate) {
        setEmployeeName(employeeName);
        setEmployeeNumber(employeeNumber);
        setHireDate(hireDate);
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        if (employeeNumber != null &&
            employeeNumber.matches("[0-9]{3}[A-M]")) {

            this.employeeNumber = employeeNumber;

        } else {
            throw new IllegalArgumentException(
                "Employee number must be in XXXL format, " +
                "where X is 0-9 and L is A-M."
            );
        }
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee Name: " + employeeName +
               "\nEmployee Number: " + employeeNumber +
               "\nHire Date: " + hireDate;
    }
}

