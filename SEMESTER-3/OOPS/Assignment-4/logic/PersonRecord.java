package logic;

import java.time.*;

public final class PersonRecord {
    private final String name, fname, degree;
    private final LocalDate dob;
    private final String reg;
    private final double marks;
    private final AgeUtility age;

    public PersonRecord(String n, String f, LocalDate d, String r, String q, double m) {
        name = n;
        fname = f;
        dob = d;
        reg = r;
        degree = q;
        marks = m;
        age = new AgeUtility(d);
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Father's Name: " + fname);
        System.out.println("Date of Birth: " + dob);
        System.out.println("Age: " + age.getAge());
        System.out.println("Registration No: " + reg);
        System.out.println("Qualifying Degree: " + degree);
        System.out.println("Percentage: " + marks);
    }
}
