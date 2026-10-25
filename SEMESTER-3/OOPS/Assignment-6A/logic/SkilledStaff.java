package logic;

public class SkilledStaff extends OfficeStaff {
    protected String skillLevel;
    public SkilledStaff(){super();}
    public SkilledStaff(String employeeId, String name, String department,String dob, String designation, int yearOfJoining,String phoneNumber, String skillLevel){
        super(employeeId, name, department, dob, designation,yearOfJoining, phoneNumber);
        this.skillLevel = skillLevel;
    }

    public String getSkillLevel() {
        return skillLevel;
    }

    public void setSkillLevel(String skillLevel) {
        this.skillLevel = skillLevel;
    }

    @Override
    public String toString() {
        return "SkilledStaff{" +
                "employeeId='" + getEmployeeId() + '\'' +
                ", name='" + getName() + '\'' +
                ", department='" + getDepartment() + '\'' +
                ", dob='" + getDob() + '\'' +
                ", designation='" + getDesignation() + '\'' +
                ", yearOfJoining=" + getYearOfJoining() +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                ", skillLevel='" + skillLevel + '\'' +
                '}';
    }
}

