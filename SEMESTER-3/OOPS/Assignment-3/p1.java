import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

class StudentRecordScanner{
    String name;
    String fatherName;
    LocalDate dob;
    int years;
    int months;
    int days;
    Scanner sc=new Scanner(System.in);
    {
        name="";
        fatherName="";
        dob=null;
        years=0;
        months=0;
        days=0;
    }
    StudentRecordScanner(String NAME,String FName,LocalDate DOB){
        name=NAME;
        fatherName=FName;
        dob=DOB;
    }

    public void setData(){
        System.out.print("Enter your Name: ");
        name=sc.nextLine();
        System.out.print("Enter your Father's Name: ");
        fatherName=sc.nextLine();
        System.out.print("Enter DOB (yyyy-mm-dd): ");
        dob=LocalDate.parse(sc.nextLine());
    }

    public void getAge(){
        LocalDate today=LocalDate.now();
        Period age=Period.between(dob,today);
        years=age.getYears();
        months=age.getMonths();
        days=age.getDays();
    }

    public void printData(){
        System.out.println("\nName of the student: "+name);
        System.out.println("Father's name: "+fatherName);
        System.out.println("Date of birth: "+dob);
        System.out.println("Age: "+years+" Years "+months+" Months "+days+" Days");
    }
}

public class p1{
    public static void main(String[] args){
        StudentRecordScanner student1=new StudentRecordScanner("","",LocalDate.now());
        student1.setData();
        student1.getAge();
        student1.printData();
    }
}
