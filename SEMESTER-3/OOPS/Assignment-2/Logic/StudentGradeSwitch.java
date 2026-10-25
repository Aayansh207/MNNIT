package Logic;

import java.util.Scanner;

public class StudentGradeSwitch{

    double marks;
    String grade;

    Scanner sc=new Scanner(System.in);

    public void getInput(){

        System.out.print("Enter marks: ");
        marks=sc.nextDouble();
    }

    public void calculateGrade(){

        int category=(int)marks/10;

        switch(category){

            case 10:
            case 9:
            case 8:
                if(marks>=85){
                    grade="A+";
                }
                else{
                    grade="A";
                }
                break;

            case 7:
                grade="A";
                break;

            case 6:
                grade="B+";
                break;

            case 5:
                grade="B";
                break;

            case 4:
                grade="C";
                break;

            case 3:
                grade="D";
                break;

            default:
                grade="F";
        }
    }

    public void displayGrade(){

        System.out.println("Marks = "+marks);
        System.out.println("Grade = "+grade);
    }
}

