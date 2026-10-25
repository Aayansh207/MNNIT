package driver;

import java.util.*;
import logic.*;

public class P4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Rectangle length: ");
        int l = s.nextInt();

        System.out.print("Rectangle breadth: ");
        double b = s.nextDouble();

        GenericShapeUtility<Integer, Double> r =
            new GenericShapeUtility<>(l, b);

        System.out.println("Rectangle Area: " + r.area());
        System.out.println("Rectangle Perimeter: " + r.perimeter());

        System.out.print("Rhombus diagonal 1: ");
        long d1 = s.nextLong();

        System.out.print("Rhombus diagonal 2: ");
        float d2 = s.nextFloat();

        GenericShapeUtility<Long, Float> rh =
            new GenericShapeUtility<>(d1, d2);

        System.out.println("Rhombus Area: " + rh.rhombusArea());
    }
}
