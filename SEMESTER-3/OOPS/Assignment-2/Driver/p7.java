package Driver;
import Logic.StudentGradeSwitch;
public class p7{
    public static void main(String[] args){
        StudentGradeSwitch student=new StudentGradeSwitch();
        student.getInput();
        student.calculateGrade();
        student.displayGrade();
    }
}

