package logic;

public class Employee {
    protected String employeeId;
    protected String name;
    protected String department;
    protected String dob;
    protected String designation;
    protected int yearOfJoining;
    protected String phoneNumber;

    public Employee() {
    }

    public Employee(String employeeId, String name, String department,
                    String dob, String designation, int yearOfJoining,
                    String phoneNumber) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.dob = dob;
        this.designation = designation;
        this.yearOfJoining = yearOfJoining;
        this.phoneNumber = phoneNumber;
    }

    public String getEmployeeId(){return employeeId;}
    public void setEmployeeId(String employeeId){this.employeeId=employeeId;}
    public String getName(){return name;}
    public void setName(String name){this.name = name;}
    public String getDepartment(){return department;}
    public void setDepartment(String department){this.department=department;}
    public String getDob(){return dob;}
    public void setDob(String dob){this.dob=dob;}
    public String getDesignation(){return designation;}
    public void setDesignation(String designation){this.designation=designation;}
    public int getYearOfJoining(){return yearOfJoining;}
    public void setYearOfJoining(int yearOfJoining){this.yearOfJoining=yearOfJoining;}
    public String getPhoneNumber(){return phoneNumber;}
    public void setPhoneNumber(String phoneNumber){this.phoneNumber=phoneNumber;}
    public void printDetails(String employeeId) {
        if (this.employeeId.equals(employeeId)) {
            System.out.println("Employee ID      : " + this.employeeId);
            System.out.println("Name             : " + this.name);
            System.out.println("Department       : " + this.department);
            System.out.println("Date of Birth    : " + this.dob);
            System.out.println("Designation      : " + this.designation);
            System.out.println("Year of Joining  : " + this.yearOfJoining);
            System.out.println("Phone Number     : " + this.phoneNumber);
        }
    }
}

