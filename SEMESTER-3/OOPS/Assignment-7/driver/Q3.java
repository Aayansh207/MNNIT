package driver;

import java.util.Scanner;
import logic.IntegerOperation;
import logic.GcdOperation;
import logic.LcmOperation;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter five integers:");

        System.out.print("Enter first integer: ");
        int a = sc.nextInt();

        System.out.print("Enter second integer: ");
        int b = sc.nextInt();

        System.out.print("Enter third integer: ");
        int c = sc.nextInt();

        System.out.print("Enter fourth integer: ");
        int d = sc.nextInt();

        System.out.print("Enter fifth integer: ");
        int e = sc.nextInt();

        IntegerOperation gcd = new GcdOperation();
        IntegerOperation lcm = new LcmOperation();

        System.out.println("\n========== RESULTS ==========");

        System.out.println("GCD of 5 numbers : "+gcd.evaluate(a, b, c, d, e));
        System.out.println("LCM of 5 numbers : "+lcm.evaluate(a, b, c, d, e));

        System.out.println("\nFor first 2 numbers:");
        System.out.println("GCD : " + gcd.evaluate(a, b));
        System.out.println("LCM : " + lcm.evaluate(a, b));

        System.out.println("\nFor first 3 numbers:");
        System.out.println("GCD : " + gcd.evaluate(a, b, c));
        System.out.println("LCM : " + lcm.evaluate(a, b, c));

        sc.close();
    }
}

