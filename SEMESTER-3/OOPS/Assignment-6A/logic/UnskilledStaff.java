package logic;

public class UnskilledStaff extends OfficeStaff {
    protected String workType;
    public UnskilledStaff() {super(); }
    public UnskilledStaff(String employeeId, String name, String department,String dob, String designation, int yearOfJoining,String phoneNumber, String workType) {
        super(employeeId, name, department, dob, designation,yearOfJoining, phoneNumber);
        this.workType = workType;
    }

    public String getWorkType() {
        return workType;
    }

    public void setWorkType(String workType) {
        this.workType = workType;
    }

    @Override
    public String toString() {
        return "UnskilledStaff{" +
                "employeeId='" + getEmployeeId() + '\'' +
                ", name='" + getName() + '\'' +
                ", department='" + getDepartment() + '\'' +
                ", dob='" + getDob() + '\'' +
                ", designation='" + getDesignation() + '\'' +
                ", yearOfJoining=" + getYearOfJoining() +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                ", workType='" + workType + '\'' +
                '}';
    }
}

