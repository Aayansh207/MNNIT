package Logic;

import java.util.Scanner;

public class StudentGrade{

    double marks;
    String grade;

    Scanner sc=new Scanner(System.in);

    public void getInput(){

        System.out.print("Enter marks: ");
        marks=sc.nextDouble();
    }

    public void calculateGrade(){

        if(marks>=85){
            grade="A+";
        }
        else if(marks>=75){
            grade="A";
        }
        else if(marks>=65){
            grade="B+";
        }
        else if(marks>=55){
            grade="B";
        }
        else if(marks>=45){
            grade="C";
        }
        else if(marks>=35){
            grade="D";
        }
        else{
            grade="F";
        }
    }

    public void displayGrade(){

        System.out.println("Marks = "+marks);
        System.out.println("Grade = "+grade);
    }
}

