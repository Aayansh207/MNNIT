package logic;

public class PGStudent extends Student{
    protected String qualifyingDegree;
    protected double marks;

    public String getQualifyingDegree(){return qualifyingDegree;}
    public void setQualifyingDegree(String qualifyingDegree){this.qualifyingDegree=qualifyingDegree;}
    public double getMarks(){return marks;}
    public void setMarks(double marks){this.marks=marks;}
}
