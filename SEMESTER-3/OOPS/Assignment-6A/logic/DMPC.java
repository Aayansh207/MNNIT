package logic;

public class DMPC extends Faculty {
    protected String committeeName;
    protected String responsibility;

    public DMPC() {
        super();
    }

    public DMPC(String employeeId, String name, String department,
                String dob, String designation, int yearOfJoining,
                String phoneNumber, String committeeName,
                String responsibility) {

        super(employeeId, name, department, dob, designation,
              yearOfJoining, phoneNumber);

        this.committeeName = committeeName;
        this.responsibility = responsibility;
    }

    public String getCommitteeName() {
        return committeeName;
    }

    public void setCommitteeName(String committeeName) {
        this.committeeName = committeeName;
    }

    public String getResponsibility() {
        return responsibility;
    }

    public void setResponsibility(String responsibility) {
        this.responsibility = responsibility;
    }

    @Override
    public String toString() {
        return "DMPC{" +
                "employeeId='" + getEmployeeId() + '\'' +
                ", name='" + getName() + '\'' +
                ", department='" + getDepartment() + '\'' +
                ", dob='" + getDob() + '\'' +
                ", designation='" + getDesignation() + '\'' +
                ", yearOfJoining=" + getYearOfJoining() +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                ", committeeName='" + committeeName + '\'' +
                ", responsibility='" + responsibility + '\'' +
                '}';
    }
}

