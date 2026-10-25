import java.time.LocalDate;
import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter your Name: ");
        String name=sc.next();
        System.out.print("Enter your Father's Name: ");
        String fatherName=sc.next();


        System.out.print("Enter DOB (yyyy-mm-dd): ");
        String dob=sc.next();
        String[] parts=dob.split("-");
        int byear=Integer.parseInt(parts[0]);
        int bmonth=Integer.parseInt(parts[1]);
        int bday=Integer.parseInt(parts[2]);

        LocalDate today=LocalDate.now();

        int cyear=today.getYear();
        int cmonth=today.getMonthValue();
        int cday=today.getDayOfMonth();

        int age=cyear-byear;

        if(cmonth<bmonth || (cmonth==bmonth && cday<bday)){age--;}
        System.out.println("Name = "+name);
        System.out.println("Father's Name = "+fatherName);
        System.out.println("DOB = "+dob);
        System.out.println("Age = "+age+" years");
    }
}