package driver;

import java.util.*;
import logic.*;

public class P3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Rectangle length: ");
        double l = s.nextDouble();

        System.out.print("Rectangle breadth: ");
        double b = s.nextDouble();

        ShapeUtility r = new ShapeUtility(l, b);

        System.out.println("Rectangle Area: " + r.area());
        System.out.println("Rectangle Perimeter: " + r.perimeter());

        System.out.print("Circle radius: ");
        double x = s.nextDouble();

        ShapeUtility c = new ShapeUtility(x);

        System.out.println("Circle Area: " + c.area());
        System.out.println("Circle Perimeter: " + c.perimeter());

        System.out.print("Rhombus diagonal 1: ");
        double d1 = s.nextDouble();

        System.out.print("Rhombus diagonal 2: ");
        double d2 = s.nextDouble();

        ShapeUtility rh = new ShapeUtility(d1, d2);

        System.out.println("Rhombus Area: " + rh.rhombusArea());
    }
}
