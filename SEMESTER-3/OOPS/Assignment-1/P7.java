import java.util.Scanner;

public class P7{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks=sc.nextInt();

        int grade;

        if(marks>=85) grade=1;
        else if(marks>=75) grade=2;
        else if(marks>=65) grade=3;
        else if(marks>=55) grade=4;
        else if(marks>=45) grade=5;
        else if(marks>=35) grade=6;
        else grade=7;

        switch(grade){
            case 1:
                System.out.println("Grade: A+");
                break;
            case 2:
                System.out.println("Grade: A");
                break;
            case 3:
                System.out.println("Grade: B+");
                break;
            case 4:
                System.out.println("Grade: B");
                break;
            case 5:
                System.out.println("Grade: C");
                break;
            case 6:
                System.out.println("Grade: D");
                break;
            case 7:
                System.out.println("Grade: F");
                break;
        }

        sc.close();
    }
}