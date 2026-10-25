package driver;

import java.util.*;
import java.time.*;
import logic.*;

public class P1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Name: ");
        String n = s.nextLine();

        System.out.print("Father's Name: ");
        String f = s.nextLine();

        System.out.print("DOB (yyyy-mm-dd): ");
        LocalDate d = LocalDate.parse(s.nextLine());

        System.out.print("Registration No: ");
        String r = s.nextLine();

        System.out.print("Degree: ");
        String q = s.nextLine();

        System.out.print("Percentage: ");
        double m = s.nextDouble();

        PersonRecord p = new PersonRecord(n, f, d, r, q, m);

        System.out.println("\nRecord:");
        p.display();
    }
}
