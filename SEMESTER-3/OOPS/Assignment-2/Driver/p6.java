package Driver;

import Logic.StudentGrade;

public class p6{

    public static void main(String[] args){

        StudentGrade student=new StudentGrade();

        student.getInput();
        student.calculateGrade();
        student.displayGrade();
    }
}

