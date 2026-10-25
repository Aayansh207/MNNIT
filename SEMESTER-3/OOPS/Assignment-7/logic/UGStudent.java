package logic;

public class UGStudent<I, S>
        extends GenericStudentRecord<I, S> {

    public UGStudent(
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
        return "UG";
    }
}

