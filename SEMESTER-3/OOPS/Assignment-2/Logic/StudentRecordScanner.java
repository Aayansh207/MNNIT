package Logic;
import java.time.LocalDate;
import java.util.Scanner;
public class StudentRecordScanner{
    String Name;
    String FName;
    String DOB;
    int years;
    int months;
    int days;
    Scanner sc=new Scanner(System.in);
    public void setData(){
        System.out.print("Enter your Name: ");
        Name=sc.next();
        System.out.print("Enter your Father's Name: ");
        FName=sc.next();
        System.out.print("Enter DOB (yyyy-mm-dd): ");
        DOB=sc.next();
    }

    public void getAge(){
        String[] parts=DOB.split("-");
        int byear=Integer.parseInt(parts[0]);
        int bmonth=Integer.parseInt(parts[1]);
        int bday=Integer.parseInt(parts[2]);
        LocalDate today=LocalDate.now();
        int cyear=today.getYear();
        int cmonth=today.getMonthValue();
        int cday=today.getDayOfMonth();
        years=cyear-byear;
        months=cmonth-bmonth;
        days=cday-bday;
        if(days<0){
            months--;
            days+=today.minusMonths(1).lengthOfMonth();
        }
        if(months<0){
            years--;
            months+=12;
        }
    }

    public void printData(){
        System.out.println("Name = "+Name);
        System.out.println("Father's Name = "+FName);
        System.out.println("DOB = "+DOB);
        System.out.println("Age = "+years+" Years "+months+" Months "+days+" Days");
    }
}
