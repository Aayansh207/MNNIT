package driver;
import logic.*;

public class P2 {
    public static void main(String[] args) {
        Rectangle r=new Rectangle(10,5.5);
        Circle c=new Circle(7);
        Rhombus rh=new Rhombus(10, 8, 6);
        System.out.println("===== RECTANGLE =====");
        System.out.println("Area      : "+Utility.area(r));
        System.out.println("Perimeter : "+Utility.perimeter(r));

        System.out.println("\n===== CIRCLE =====");
        System.out.println("Area      : "+Utility.area(c));
        System.out.println("Perimeter : "+Utility.perimeter(c));

        System.out.println("\n===== RHOMBUS =====");
        System.out.println("Area      : "+Utility.area(rh));
        System.out.println("Perimeter : "+Utility.perimeter(rh));
    }
}

