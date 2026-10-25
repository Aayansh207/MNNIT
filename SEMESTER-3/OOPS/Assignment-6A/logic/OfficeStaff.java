package logic;
import java.util.ArrayList;

public class OfficeStaff extends Employee {
    protected ArrayList<String> skills;
    public OfficeStaff() {
        skills = new ArrayList<String>();
    }

    public OfficeStaff(String employeeId, String name, String department,
                       String dob, String designation, int yearOfJoining,
                       String phoneNumber) {
        super(employeeId, name, department, dob, designation,
              yearOfJoining, phoneNumber);
        skills = new ArrayList<String>();
    }

    public void addSkill(String skill) {
        skills.add(skill);
    }

    public ArrayList<String> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<String> skills) {
        this.skills = skills;
    }

    public void printSkills() {
        System.out.println("Skills:");
        for (String skill : skills) {
            System.out.println("- " + skill);
        }
    }

    @Override
    public void printDetails(String employeeId) {
        if (this.employeeId.equals(employeeId)) {
            super.printDetails(employeeId);

            System.out.println();
            printSkills();
        }
    }
}

