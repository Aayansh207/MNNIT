package logic;

public class PGStudent<I, S>
        extends GenericStudentRecord<I, S> {

    public PGStudent(
            String name,
            I registrationId,
            String fatherName,
            String degreeName,
            S semester,
            double cpi) {

        super(name, registrationId, fatherName,
              degreeName, semester, cpi);
    }

    @Override
    public String getCategory() {
        return "PG";
    }
}

