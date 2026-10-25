package Logic;

import java.util.Scanner;

public class Rectangle{

    float length;
    double breadth;
    double perimeter;

    Scanner sc=new Scanner(System.in);

    public void readData(){

        System.out.print("Enter length: ");
        length=sc.nextFloat();

        System.out.print("Enter breadth: ");
        breadth=sc.nextDouble();
    }

    public void calculatePerimeter(){

        int l=(int)length;
        int b=(int)breadth;

        perimeter=2*(l+b);
    }

    public void displayPerimeter(){

        System.out.println("Perimeter = "+perimeter);
    }
}

