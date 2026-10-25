package logic;

import java.time.LocalDate;
import java.time.Period;

public abstract class PersonalRecord implements PrintableRecord {
    protected String name;
    protected String fatherName;
    protected LocalDate dateOfBirth;

    public PersonalRecord(String name, String fatherName, LocalDate dateOfBirth) {
        this.name = name;
        this.fatherName = fatherName;
        this.dateOfBirth = dateOfBirth;
    }

    public int calculateAge() {
        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }

    public String getName() {
        return name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
}

