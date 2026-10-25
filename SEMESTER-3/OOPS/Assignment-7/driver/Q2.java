package driver;

import java.util.Scanner;
import logic.Rectangle;
import logic.Square;
import logic.PlaneShape;

public class Q2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rectangle length (float): ");
        float length = sc.nextFloat();

        System.out.print("Enter rectangle breadth (double): ");
        double breadth = sc.nextDouble();

        PlaneShape rectangle = new Rectangle(length, breadth);
        System.out.print("Enter square side: ");
        double side = sc.nextDouble();

        PlaneShape square = new Square(side);

        System.out.println("\n========== RECTANGLE ==========");
        System.out.println("Length   : " + length);
        System.out.println("Breadth  : " + breadth);
        System.out.println("Area     : " + rectangle.area());
        System.out.println("Perimeter: " + rectangle.perimeter());
        System.out.println("Diagonal : " + rectangle.diagonal());

        System.out.println("\n========== SQUARE ==========");
        System.out.println("Side     : " + side);
        System.out.println("Area     : " + square.area());
        System.out.println("Perimeter: " + square.perimeter());
        System.out.println("Diagonal : " + square.diagonal());

        sc.close();
    }
}

