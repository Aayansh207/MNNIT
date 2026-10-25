import java.util.Scanner;

class RectangleUtil{
    static float area(float length,float breadth){return length*breadth;}
    static double area(double length,double breadth){return length*breadth;}
    static float perimeter(float length,float breadth){return 2*(length+breadth);}
    static double perimeter(double length,double breadth){return 2*(length+breadth);}
    static float diagonal(float length,float breadth){return (float)Math.sqrt(length*length+breadth*breadth);}
    static double diagonal(double length,double breadth){return Math.sqrt(length*length+breadth*breadth);}
}

class Rectangle{
    float length;
    double breadth;
    Rectangle(float l,double b){length=l;breadth=b;}
    void calculate(T length,T breadth){
        System.out.println("Perimeter = "+RectangleUtil.perimeter(length,breadth));
        System.out.println("Area = "+RectangleUtil.area(length,breadth));
        System.out.println("Diagonal = "+RectangleUtil.diagonal(length,breadth));
    }
    void calculate(double length,double breadth){
        System.out.println("Perimeter = "+RectangleUtil.perimeter(length,breadth));
        System.out.println("Area = "+RectangleUtil.area(length,breadth));
        System.out.println("Diagonal = "+RectangleUtil.diagonal(length,breadth));
    }
}

public class p2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length: ");
        float length=sc.nextFloat();
        System.out.print("Enter breadth: ");
        double breadth=sc.nextDouble();
        Rectangle r=new Rectangle(length,breadth);
        r.calculate(r.length,(float)r.breadth);
        r.calculate((double)r.length,r.breadth);
    }
}
