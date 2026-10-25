package logic;

public abstract class GenericStudentRecord<I, S>
        implements PrintableSummary {

    protected String name;
    protected I registrationId;
    protected String fatherName;
    protected String degreeName;
    protected S semester;
    protected double cpi;

    public GenericStudentRecord(
            String name,
            I registrationId,
            String fatherName,
            String degreeName,
            S semester,
            double cpi) {

        this.name = name;
        this.registrationId = registrationId;
        this.fatherName = fatherName;
        this.degreeName = degreeName;
        this.semester = semester;
        this.cpi = cpi;
    }

    public I getRegistrationId() {
        return registrationId;
    }

    public S getSemester() {
        return semester;
    }

    public String getDegreeName() {
        return degreeName;
    }

    public double getCpi() {
        return cpi;
    }

    public String getName() {
        return name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public abstract String getCategory();

    @Override
    public void printSummary() {
        System.out.println("Category        : " + getCategory());
        System.out.println("Name            : " + name);
        System.out.println("Registration ID : " + registrationId);
        System.out.println("ID Type         : "
                + registrationId.getClass().getSimpleName());
        System.out.println("Father's Name   : " + fatherName);
        System.out.println("Degree          : " + degreeName);
        System.out.println("Semester        : " + semester);
        System.out.println("Semester Type   : "
                + semester.getClass().getSimpleName());
        System.out.println("CPI             : " + cpi);
        System.out.println("------------------------------------");
    }
}
