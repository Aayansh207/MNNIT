package logic;

import java.time.*;

public final class AgeUtility {
    private final LocalDate dob;

    public AgeUtility(LocalDate dob) {
        this.dob = dob;
    }

    public String getAge() {
        Period p = Period.between(dob, LocalDate.now());
        return p.getYears() + " Years, " +
               p.getMonths() + " Months, " +
               p.getDays() + " Days";
    }
}
