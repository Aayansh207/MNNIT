package logic;

public class HOD extends Faculty {
    protected String department;
    protected int yearsAsHOD;

    public HOD() {
        super();
    }

    public HOD(String employeeId, String name, String department,
               String dob, String designation, int yearOfJoining,
               String phoneNumber, String hodDepartment, int yearsAsHOD) {

        super(employeeId, name, department, dob, designation,
              yearOfJoining, phoneNumber);

          this.department = hodDepartment;
        this.yearsAsHOD = yearsAsHOD;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getYearsAsHOD() {
        return yearsAsHOD;
    }

    public void setYearsAsHOD(int yearsAsHOD) {
        this.yearsAsHOD = yearsAsHOD;
    }

    @Override
    public String toString() {
        return "HOD{" +
                "employeeId='" + getEmployeeId() + '\'' +
                ", name='" + getName() + '\'' +
                ", department='" + department + '\'' +
                ", dob='" + getDob() + '\'' +
                ", designation='" + getDesignation() + '\'' +
                ", yearOfJoining=" + getYearOfJoining() +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                ", yearsAsHOD=" + yearsAsHOD +
                '}';
    }
}

