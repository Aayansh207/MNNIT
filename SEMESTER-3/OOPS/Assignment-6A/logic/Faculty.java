package logic;
import java.util.ArrayList;

public class Faculty extends Employee {
    protected ArrayList<String> subjects;
    protected ArrayList<String> labs;

    public Faculty() {
        subjects = new ArrayList<String>();
        labs = new ArrayList<String>();
    }

    public Faculty(String employeeId, String name, String department,
                   String dob, String designation, int yearOfJoining,
                   String phoneNumber) {
        super(employeeId, name, department, dob, designation,
              yearOfJoining, phoneNumber);
        subjects = new ArrayList<String>();
        labs = new ArrayList<String>();
    }

    public void addSubject(String subject) {
        subjects.add(subject);
    }

    public void addLab(String lab) {
        labs.add(lab);
    }

    public ArrayList<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<String> subjects) {
        this.subjects = subjects;
    }

    public ArrayList<String> getLabs() {
        return labs;
    }

    public void setLabs(ArrayList<String> labs) {
        this.labs = labs;
    }

    public void printSubjects() {
        System.out.println("Subjects Taught:");
        for (String subject : subjects) {
            System.out.println("- " + subject);
        }
    }

    public void printLabs() {
        System.out.println("Labs Taught:");
        for (String lab : labs) {
            System.out.println("- " + lab);
        }
    }

    @Override
    public void printDetails(String employeeId) {
        if (this.employeeId.equals(employeeId)) {
            super.printDetails(employeeId);

            System.out.println();
            printSubjects();

            System.out.println();
            printLabs();
        }
    }
}

