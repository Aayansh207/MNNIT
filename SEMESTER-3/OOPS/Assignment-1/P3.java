import java.util.Scanner;

public class P3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float length;
        double breadth;
        System.out.print("Enter length of rectangle: ");
        length=sc.nextFloat();
        System.out.print("Enter breadth of rectangle: ");
        breadth=sc.nextDouble();
        int l=(int)length;
        int b=(int)breadth;
        double perimeter=2*(l+b);
        System.out.println("Perimeter of rectangle = "+perimeter);
        sc.close();
    }
}