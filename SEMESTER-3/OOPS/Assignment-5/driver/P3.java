package driver;
import logic.*;

public class P3 {
    public static void main(String[] args) {
        RectangleP3<Integer> r1 = new RectangleP3<>(10, 5);
        CircleP3<Double> c1 = new CircleP3<>(7.5);
        RhombusP3<Float> rh1 = new RhombusP3<>(10.5f, 8.5f, 6.5f);
        System.out.println("===== RECTANGLE =====");
        System.out.println("Area      : " + UtilityP3.area(r1));
        System.out.println("Perimeter : " + UtilityP3.perimeter(r1));
        System.out.println("\n===== CIRCLE =====");
        System.out.println("Area      : " + UtilityP3.area(c1));
        System.out.println("Perimeter : " + UtilityP3.perimeter(c1));
        System.out.println("\n===== RHOMBUS =====");
        System.out.println("Area      : " + UtilityP3.area(rh1));
        System.out.println("Perimeter : " + UtilityP3.perimeter(rh1));
    }
}

